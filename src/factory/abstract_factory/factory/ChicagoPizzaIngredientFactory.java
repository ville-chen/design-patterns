package factory.abstract_factory.factory;

import factory.abstract_factory.product.ingredient.BlackOlives;
import factory.abstract_factory.product.ingredient.Cheese;
import factory.abstract_factory.product.ingredient.Clams;
import factory.abstract_factory.product.ingredient.Dough;
import factory.abstract_factory.product.ingredient.Eggplant;
import factory.abstract_factory.product.ingredient.FrozenClams;
import factory.abstract_factory.product.ingredient.MozzarellaCheese;
import factory.abstract_factory.product.ingredient.Pepperoni;
import factory.abstract_factory.product.ingredient.PlumTomatoSauce;
import factory.abstract_factory.product.ingredient.Sauce;
import factory.abstract_factory.product.ingredient.SlicedPepperoni;
import factory.abstract_factory.product.ingredient.Spinach;
import factory.abstract_factory.product.ingredient.ThickCrustDough;
import factory.abstract_factory.product.ingredient.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new Eggplant()};
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
