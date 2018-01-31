package factory.factory_method.factory;

import factory.factory_method.product.Pizza;

/**
 * Created by admin on 2018/1/29.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 工厂方法
     */
    abstract Pizza createPizza(String type);
}
