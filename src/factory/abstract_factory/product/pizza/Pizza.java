package factory.abstract_factory.product.pizza;

import factory.abstract_factory.product.ingredient.Cheese;
import factory.abstract_factory.product.ingredient.Clams;
import factory.abstract_factory.product.ingredient.Dough;
import factory.abstract_factory.product.ingredient.Pepperoni;
import factory.abstract_factory.product.ingredient.Sauce;
import factory.abstract_factory.product.ingredient.Veggies;
import lombok.Data;

@Data
public abstract class Pizza {
    private String name;

	private Dough dough;
	private Sauce sauce;
	private Veggies veggies[];
	private Cheese cheese;
	private Pepperoni pepperoni;
	private Clams clam;

    public abstract void prepare();

    public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

    public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

    public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

    public void setName(String name) {
		this.name = name;
	}

    public String getName() {
		return name;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("---- ").append(name).append(" ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
