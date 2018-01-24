package observer.observer;

import observer.api.DisplayElement;

/**
 * Created by admin on 2018/1/24.
 * 观察者类型：当前观测值
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    @Override
    public void update() {

    }

    @Override
    public void display() {
        System.out.println("Current:");
    }
}
