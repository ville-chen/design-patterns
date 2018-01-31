package factory.factory_method;

import factory.factory_method.factory.ChicagoStylePizzaStore;
import factory.factory_method.factory.NYStylePizzaStore;
import factory.factory_method.factory.PizzaStore;
import factory.factory_method.product.Pizza;

/**
 * Created by admin on 2018/1/29.
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        System.out.println(" -------------------- ");

        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
