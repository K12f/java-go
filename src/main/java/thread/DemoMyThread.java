package thread;

/**
 * @author k12
 * @date 2022/3/10
 * @desc Demo
 */
public class DemoMyThread {
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("mythread");
        }
    }

    public static void main(String[] args) {
        var mythread = new MyThread();

        mythread.start();
    }
}
