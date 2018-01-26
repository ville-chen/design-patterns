package decorator.decorator;

import decorator.decorated.Beverage;

/**
 * Created by admin on 2018/1/26.
 * 奶泡
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        setDescription("Whip");
        setCost(0.10);
        setBeverage(beverage);
    }
}
