package thread;

/**
 * @author k12
 * @date 2022/3/15
 * @desc SemaphoreThread
 */
public class SemaphoreThread {
    private static volatile int signal = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (signal < 5) {
                if (signal % 2 == 0) {
                    System.out.println("threadA: " + signal);
                    signal++;
                }
            }
        }).start();

        Thread.sleep(1000);

        new Thread(() -> {
            while (signal < 5) {
                if (signal % 2 == 1) {
                    System.out.println("threadB: " + signal);
                    signal++;
                }
            }
        }).start();

    }
}
