package factory.abstract_factory.client;

import factory.abstract_factory.factory.ChicagoPizzaIngredientFactory;
import factory.abstract_factory.factory.PizzaIngredientFactory;
import factory.abstract_factory.product.pizza.CheesePizza;
import factory.abstract_factory.product.pizza.ClamPizza;
import factory.abstract_factory.product.pizza.PepperoniPizza;
import factory.abstract_factory.product.pizza.Pizza;
import factory.abstract_factory.product.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
        }
        return pizza;
    }
}
