package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author k12
 * @date 2022/3/10
 * @desc DemoCallable
 */
public class DemoCallable {
    public static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            Thread.sleep(1000);
            System.out.println("waiting");
            Thread.sleep(1000);
            return 2;
        }
    }

    public static void main(String[] args) throws Exception {
        var executor = Executors.newSingleThreadExecutor();
        var task = new Task();

        Future<Integer> future = executor.submit(task);

        System.out.println(future.get());

    }
}
