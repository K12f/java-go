package thread;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.stream.Stream;

/**
 * @author k12
 * @date 2022/3/31
 * @desc SemaphoreDemo
 */
public class SemaphoreDemo {

    static class MySemaphoreDemo implements Runnable {
        private int value;

        private Semaphore semaphore;

        MySemaphoreDemo(int value, Semaphore semaphore) {
            this.value = value;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire(); // 获取permit
                System.out.println(String.format("当前线程是%d, 还剩%d个资源，还有%d个线程在等待",
                        value, semaphore.availablePermits(), semaphore.getQueueLength()));


                var random = new Random();

                Thread.sleep(random.nextInt(1000));
                System.out.println(String.format("线程%d释放了资源", value));
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }

    public static void main(String[] args) {
        var semaphore = new Semaphore(2);

        for (int i = 0; i < 10; i++) {
            new Thread(new MySemaphoreDemo(i, semaphore)).start();
        }
    }
}
