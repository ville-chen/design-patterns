package decorator.decorated;

/**
 * Created by admin on 2018/1/26.
 * 饮料
 */
public abstract class Beverage {

    private double cost;
    private String description;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return getDescription() + " $" + getCost();
    }
}
