package thread;

/**
 * @author k12
 * @date 2022/3/10
 * @desc DemoRunable
 */
public class DemoRunnable {

    public static class MyThread implements Runnable {
        @Override
        public void run() {
            System.out.println("my thread");
        }
    }

    public static void main(String[] args) {
        new Thread(new MyThread()).start();

        new Thread(()->{
            System.out.println("匿名内部类");
        }).start();
    }
}
