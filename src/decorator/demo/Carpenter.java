package decorator.demo;

/**
 * 木匠类
 */
public class Carpenter implements Worker{

    @Override
    public void doWork() {
        System.out.println("木匠做家具！！！");
    }
}
