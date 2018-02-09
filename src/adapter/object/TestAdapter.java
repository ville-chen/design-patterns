package adapter.object;

import adapter.object.adaptee.Duck;
import adapter.object.adaptee.MallardDuck;
import adapter.object.adapter.DuckAdapter;
import adapter.object.adapter.TurkeyAdapter;
import adapter.object.client.Turkey;
import adapter.object.client.WildTurkey;

/**
 * Created by admin on 2018/2/8.
 */
public class TestAdapter {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        Turkey duckAdapter = new DuckAdapter(mallardDuck);

        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe Duck says...");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("\nThe TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

        System.out.println("\nThe duckAdapter says...");
        duckAdapter.gobble();
        for (int i = 0; i < 5; i++) {
            duckAdapter.fly();
        }
    }
}
