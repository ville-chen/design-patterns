package decorator.decorator;

import decorator.decorated.Beverage;

/**
 * Created by admin on 2018/1/26.
 * 摩卡
 */
public class Mocha extends CondimentDecorator {


    public Mocha(Beverage beverage) {
        setDescription("Mocha");
        setCost(0.20);
        setBeverage(beverage);
    }
}
