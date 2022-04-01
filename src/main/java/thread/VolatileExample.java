package thread;

/**
 * @author k12
 * @date 2022/3/18
 * @desc VolatileExample
 */
public class VolatileExample {
    int a = 0;
    volatile boolean flag = false;

    public void writer() {
        a = 1; // step 1
        flag = true; // step 2
    }

    public void reader() {
        if (flag) { // step 3
            System.out.println(a); // step 4
        }
    }

    public static void main(String[] args) {
        var volatileExample = new VolatileExample();
        volatileExample.writer();
        volatileExample.reader();
    }

}
