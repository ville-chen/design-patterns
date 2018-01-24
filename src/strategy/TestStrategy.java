package strategy;

import strategy.algorithm.FlyWithWings;
import strategy.client.Duck;
import strategy.client.MallardDuck;
import strategy.client.ModelDuck;

/**
 * Created by admin on 2018/1/24.
 */
public class TestStrategy {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();
        duck.swim();
        duck.display();

        //动态的使用算法而无需修改client
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();

    }
}
