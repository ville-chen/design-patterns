package observer.observer;

import observer.api.DisplayElement;

/**
 * Created by admin on 2018/1/24.
 * 观察者类型：统计最值，平均值布告栏
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    public StatisticsDisplay() {

    }

    @Override
    public void update() {

    }

    @Override
    public void display() {
        System.out.println("Statistics:");
    }
}
