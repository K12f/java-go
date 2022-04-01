package thread;

/**
 * @author k12
 * @date 2022/3/14
 * @desc NoneBlock
 */
public class NoneBlock {
    private static final Object lock = new Object();

    static class ThreadA implements Runnable {

        @Override
        public void run() {
            synchronized (lock){
                for (int i = 0; i < 10; i++) {
                    System.out.println("a:" + i);
                }
            }
        }
    }

    static class ThreadB implements Runnable {
        @Override
        public void run() {
           synchronized (lock){
               for (int i = 0; i < 10; i++) {
                   System.out.println("b:" + i);
               }
           }
        }
    }

    public static void main(String[] args) {
        var threadA = new ThreadA();
        var threadB = new ThreadB();

        new Thread(threadA).start();
        new Thread(threadB).start();
    }
}
