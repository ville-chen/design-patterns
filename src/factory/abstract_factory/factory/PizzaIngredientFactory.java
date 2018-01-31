package factory.abstract_factory.factory;

import factory.abstract_factory.product.ingredient.Cheese;
import factory.abstract_factory.product.ingredient.Clams;
import factory.abstract_factory.product.ingredient.Dough;
import factory.abstract_factory.product.ingredient.Pepperoni;
import factory.abstract_factory.product.ingredient.Sauce;
import factory.abstract_factory.product.ingredient.Veggies;

/**
 * pizza原料工厂
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
 
}
