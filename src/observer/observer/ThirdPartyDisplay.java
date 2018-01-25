package observer.observer;

import observer.thirdparty.DisplayElement;
import observer.subject.Subject;

/**
 * Created by admin on 2018/1/24.
 * 观察者类型：支持第三方接入的布告栏
 */
public class ThirdPartyDisplay implements Observer, DisplayElement {

    @Override
    public void subscribe(Subject subject) {

    }

    @Override
    public void update(Subject subject, Object arg) {

    }

    @Override
    public void display() {
        System.out.println("ThirdParty:");
    }
}
