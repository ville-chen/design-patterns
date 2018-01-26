package decorator;

import decorator.decorated.Beverage;
import decorator.decorated.DarkRoast;
import decorator.decorated.Espresso;
import decorator.decorated.HouseBlend;
import decorator.decorator.Mocha;
import decorator.decorator.Soy;
import decorator.decorator.Whip;

/**
 * Created by admin on 2018/1/26.
 */
public class TestDecorator {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3);
    }
}
