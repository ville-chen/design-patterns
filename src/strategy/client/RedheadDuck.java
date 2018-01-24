package strategy.client;

import strategy.algorithm.FlyWithWings;
import strategy.algorithm.Quack;

/**
 * Created by admin on 2018/1/24.
 * 各种客户需求类 红头鸭
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("looks like a redhead!");
    }
}
