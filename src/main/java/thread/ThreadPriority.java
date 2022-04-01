package thread;

import java.util.stream.IntStream;

/**
 * @author k12
 * @date 2022/3/10
 * @desc ThreadPriority
 */
public class ThreadPriority {
    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(i -> {
            var thread = new Thread(() -> {
                System.out.printf("当前执行的线程是：%s，优先级：%d%n",
                        Thread.currentThread().getName(),
                        Thread.currentThread().getPriority());
            });

            thread.setPriority(i);
            thread.start();
        });
    }
}
