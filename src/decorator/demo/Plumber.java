package decorator.demo;

/**
 * 水管工类:
 */
public class Plumber implements Worker{

    @Override
    public void doWork() {
        System.out.println("水管工修水管！！！");
    }
}