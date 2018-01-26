package decorator.decorator;

import decorator.decorated.Beverage;

/**
 * Created by admin on 2018/1/26.
 * 调料装饰者
 */
public abstract class CondimentDecorator extends Beverage {

    private Beverage beverage;

    protected Beverage getBeverage() {
        return beverage;
    }

    protected void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return super.getCost() + getBeverage().getCost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + getBeverage().getDescription();
    }
}
