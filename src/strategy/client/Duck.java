package strategy.client;

import lombok.Data;
import strategy.algorithm.FlyBehavior;
import strategy.algorithm.QuackBehavior;

/**
 * Created by admin on 2018/1/24.
 * 算法的客户抽象
 */
@Data
public abstract class Duck {

    //面向接口的行为委托
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();

    public void swim() {
        System.out.println("can swim!");
    }
}
