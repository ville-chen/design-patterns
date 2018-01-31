package factory.abstract_factory.factory;

import factory.abstract_factory.product.ingredient.Cheese;
import factory.abstract_factory.product.ingredient.Clams;
import factory.abstract_factory.product.ingredient.Dough;
import factory.abstract_factory.product.ingredient.FreshClams;
import factory.abstract_factory.product.ingredient.Garlic;
import factory.abstract_factory.product.ingredient.MarinaraSauce;
import factory.abstract_factory.product.ingredient.Mushroom;
import factory.abstract_factory.product.ingredient.Onion;
import factory.abstract_factory.product.ingredient.Pepperoni;
import factory.abstract_factory.product.ingredient.RedPepper;
import factory.abstract_factory.product.ingredient.ReggianoCheese;
import factory.abstract_factory.product.ingredient.Sauce;
import factory.abstract_factory.product.ingredient.SlicedPepperoni;
import factory.abstract_factory.product.ingredient.ThinCrustDough;
import factory.abstract_factory.product.ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
