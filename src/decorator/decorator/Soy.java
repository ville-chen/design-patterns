package decorator.decorator;

import decorator.decorated.Beverage;

/**
 * Created by admin on 2018/1/26.
 * 奶泡
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        setDescription("Soy");
        setCost(0.15);
        setBeverage(beverage);
    }
}
