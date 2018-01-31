package factory.factory_method.factory;

import factory.factory_method.product.NYStyleCheesePizza;
import factory.factory_method.product.NYStyleClamPizza;
import factory.factory_method.product.NYStylePepperoniPizza;
import factory.factory_method.product.NYStyleVeggiePizza;
import factory.factory_method.product.Pizza;

/**
 * Created by admin on 2018/1/29.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        }
        if ("pepperoni".equals(type)) {
            return new NYStylePepperoniPizza();
        }
        if ("clam".equals(type)) {
            return new NYStyleClamPizza();
        }
        if ("veggie".equals(type)) {
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}
