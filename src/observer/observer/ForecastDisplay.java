package observer.observer;

import observer.api.DisplayElement;

/**
 * Created by admin on 2018/1/24.
 * 观察者类型：气压布告栏
 */
public class ForecastDisplay implements Observer, DisplayElement {
    @Override
    public void update() {

    }

    @Override
    public void display() {
        System.out.println("Forecast:");
    }
}
