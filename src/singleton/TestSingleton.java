package singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/2/2.
 */
public class TestSingleton {
    public static void main(String[] args) {
         /*HungrySingleton s1 = HungrySingleton.getInstance();
         HungrySingleton s2 = HungrySingleton.getInstance();
         System.out.println(s1 == s2);

         LazySingleton ls1 = LazySingleton.getInstance();
         LazySingleton ls2 = LazySingleton.getInstance();
         System.out.println(ls1 == ls2);*/

        TestThread threadBody = new TestThread();
        List<Thread> threadList = new ArrayList<>();
        for (int i = 10; i > 0; i --) {
            threadList.add(new Thread(threadBody));
        }
        threadList.forEach(Thread::start);
    }
}
