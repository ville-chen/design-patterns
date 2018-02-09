package adapter.object.adapter;

import adapter.object.adaptee.Duck;
import adapter.object.client.Turkey;

/**
 * Created by admin on 2018/2/8.
 */
public class TurkeyAdapter implements Duck {

    /**
     * adaptee 被适配者
     */
    private Turkey turkey;

    public TurkeyAdapter() {
    }

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void setTurkey(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
