package adapter.object.adapter;

import adapter.object.adaptee.Duck;
import adapter.object.client.Turkey;

import java.util.Random;

/**
 * Created by admin on 2018/2/8.
 */
public class DuckAdapter implements Turkey {

    /**
     * adaptee 被适配者
     */
    private Duck duck;

    private Random random;

    public void setDuck(Duck duck) {
        this.duck = duck;
    }

    public DuckAdapter() {
        random = new Random();
    }

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (random.nextInt(5) == 4) {
            duck.fly();
        }
    }
}
