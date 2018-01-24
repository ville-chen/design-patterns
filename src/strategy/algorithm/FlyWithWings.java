package strategy.algorithm;

/**
 * Created by admin on 2018/1/24.
 * 一系列的算法类
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("can fly with wings!");
    }
}
