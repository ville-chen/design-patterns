package factory.factory_method.product;

/**
 * Created by admin on 2018/1/29.
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        this.setName("NY Style Sauce and Cheese Pizza");
        this.setDough("Thin Crust Dough");
        this.setSauce("Marinara Sauce");
        this.getToppings().add("Grated Reggiano Cheese");
    }

}
