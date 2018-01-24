package strategy.client;

import strategy.algorithm.FlyNoWay;
import strategy.algorithm.Squeak;

/**
 * Created by admin on 2018/1/24.
 * 各种客户需求类 橡皮鸭
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("looks like a rubber!");
    }
}
