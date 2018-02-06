package singleton;

/**
 * Created by admin on 2018/2/2.
 */
public class TestThread implements Runnable {

    @Override
    public void run() {
        System.out.println(LazySingleton.getInstance());
    }
}