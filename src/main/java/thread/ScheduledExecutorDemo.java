package thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

/**
 * @author k12
 * @date 2022/4/1
 * @desc ScheduledExecutorDemo
 */
public class ScheduledExecutorDemo {
    private static final ScheduledExecutorService executor = new ScheduledThreadPoolExecutor(1, Executors.defaultThreadFactory());

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        executor.scheduleWithFixedDelay(() -> {

            System.out.println(simpleDateFormat.format(new Date()) + "啊吧啊吧");
        }, 1, 1, TimeUnit.SECONDS);
    }
}
