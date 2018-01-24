package strategy.client;

import strategy.algorithm.FlyNoWay;
import strategy.algorithm.MuteQuack;

/**
 * Created by admin on 2018/1/24.
 * 各种客户需求类 模型鸭
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("looks like a model");
    }
}
