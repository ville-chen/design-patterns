package factory.simple_factory.factory;

import factory.simple_factory.product.CheesePizza;
import factory.simple_factory.product.ClamPizza;
import factory.simple_factory.product.PepperoniPizza;
import factory.simple_factory.product.Pizza;
import factory.simple_factory.product.VeggiePizza;

/**
 * Created by admin on 2018/1/29.
 * 简单工厂，并不是一种设计模式
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza();
        }
        if ("pepperoni".equals(type)) {
            return new PepperoniPizza();
        }
        if ("clam".equals(type)) {
            return new ClamPizza();
        }
        if ("veggie".equals(type)) {
            return new VeggiePizza();
        }
        return null;
    }
}
