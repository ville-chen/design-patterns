package factory.simple_factory.client;

import factory.simple_factory.product.Pizza;
import factory.simple_factory.factory.SimplePizzaFactory;

/**
 * Created by admin on 2018/1/29.
 */
public class PizzaStore {
    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
