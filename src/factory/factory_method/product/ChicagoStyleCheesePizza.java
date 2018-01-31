package factory.factory_method.product;

/**
 * Created by admin on 2018/1/29.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        this.setName("Chicago Style Deep Dish Pizza");
        this.setDough("Exra Thick Crust Dough");
        this.setSauce("Plum Tomato Sauce");
        this.getToppings().add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("cutting the pizza into square slices");
    }

}
