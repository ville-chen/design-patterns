package factory.factory_method.factory;

import factory.factory_method.product.ChicagoStyleCheesePizza;
import factory.factory_method.product.ChicagoStyleClamPizza;
import factory.factory_method.product.ChicagoStylePepperoniPizza;
import factory.factory_method.product.ChicagoStyleVeggiePizza;
import factory.factory_method.product.Pizza;

/**
 * Created by admin on 2018/1/29.
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        }
        if ("pepperoni".equals(type)) {
            return new ChicagoStylePepperoniPizza();
        }
        if ("clam".equals(type)) {
            return new ChicagoStyleClamPizza();
        }
        if ("veggie".equals(type)) {
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
