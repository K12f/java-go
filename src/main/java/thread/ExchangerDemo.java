package thread;

import java.util.concurrent.Exchanger;

/**
 * @author k12
 * @date 2022/3/31
 * @desc ExchangerDemo
 */
public class ExchangerDemo {
    public static void main(String[] args) throws InterruptedException {
        var exchanger = new Exchanger<String>();


        new Thread(()->{
            try {
                System.out.println("这是线程A，得到了另一个线程的数据："
                        + exchanger.exchange("这是来自线程A的数据"));
            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();

        System.out.println("这个时候线程A是阻塞的，在等待线程B的数据");
        Thread.sleep(1000);



        new Thread(()->{
            try {
                System.out.println("这是线程B，得到了另一个线程的数据："
                        + exchanger.exchange("这是来自线程B的数据"));
            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();
    }
}
