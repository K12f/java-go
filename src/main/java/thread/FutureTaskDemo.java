package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author k12
 * @date 2022/3/10
 * @desc FutureTaskDemo
 */
public class FutureTaskDemo {

    public static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            Thread.sleep(1000);
            return 2;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var executor = Executors.newSingleThreadExecutor();

        var futureTask = new FutureTask<>(new Task());

        executor.submit(futureTask);

        System.out.println(futureTask.get());
    }
}
