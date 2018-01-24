package observer.observer;

import observer.api.DisplayElement;

/**
 * Created by admin on 2018/1/24.
 * 观察者类型：支持第三方接入的布告栏
 */
public class ThirdPartyDisplay implements Observer, DisplayElement {

    @Override
    public void update() {

    }

    @Override
    public void display() {
        System.out.println("ThirdParty:");
    }
}
