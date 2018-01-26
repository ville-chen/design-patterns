package decorator.decorator;

import decorator.decorated.Beverage;

/**
 * Created by admin on 2018/1/26.
 * 奶泡
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        setDescription("Milk");
        setCost(0.10);
        setBeverage(beverage);
    }
}
