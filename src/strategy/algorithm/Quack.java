package strategy.algorithm;

/**
 * Created by admin on 2018/1/24.
 * 一系列的算法类
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack quack quack!");
    }
}
