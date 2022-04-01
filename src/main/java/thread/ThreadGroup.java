package thread;

/**
 * @author k12
 * @date 2022/3/10
 * @desc ThreadGroup
 */
public class ThreadGroup {

    public static void main(String[] args) {
//        new Thread(() -> {
//            System.out.println("test thread current thread:" + Thread.currentThread().getName());
//            System.out.println("test Thread currentThread group:" + Thread.currentThread().getThreadGroup().getName());
//        }).start();
//
//        System.out.println("main thread:" + Thread.currentThread().getName());
//        System.out.println("main currentThread group:" + Thread.currentThread().getThreadGroup().getName());

        var threadGroup = Thread.currentThread().getThreadGroup();

        var threads = new Thread[threadGroup.activeCount()];
    }
}
