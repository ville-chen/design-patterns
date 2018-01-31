package factory.abstract_factory.product.pizza;

import factory.abstract_factory.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;
 
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	public void prepare() {
		System.out.println("Preparing " + this.getName());
		this.setDough(ingredientFactory.createDough());
		this.setSauce(ingredientFactory.createSauce());
		this.setCheese(ingredientFactory.createCheese());
	}
}
