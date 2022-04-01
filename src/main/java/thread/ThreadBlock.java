package thread;

/**
 * @author k12
 * @date 2022/3/11
 * @desc ThreadBlock
 */
public class ThreadBlock {

    public static void main(String[] args) throws InterruptedException {
        var a = new Thread(new Runnable() {
            @Override
            public void run() {
                testMethod();
            }
        }, "a");


        var b = new Thread(() -> {
            testMethod();
        },"b");

        a.start();

        Thread.sleep(1000L);

        b.start();
        System.out.println(a.getName() + ":" + a.getState()); // 输出？
        System.out.println(b.getName() + ":" + b.getState()); // 输出？
    }

    // 同步方法争夺锁
    private static synchronized void testMethod() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
