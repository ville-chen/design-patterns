package observer.observer;

import observer.dto.WeatherDto;
import observer.subject.DefaultSubject;
import observer.subject.Subject;
import observer.thirdparty.DisplayElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/1/24.
 * 观察者类型：当前观测值，推送获取数据
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private List<Subject> subjectList;

    private WeatherDto weatherDto;

    public CurrentConditionsDisplay() {
        subjectList = new ArrayList<>();
    }

    @Override
    public void subscribe(Subject subject) {
        //观察者利用主题接口向主题注册
        subject.registerObserver(this);
        subjectList.add(subject);
    }

    @Override
    public void update(Subject subject, Object arg) {
        if (null == arg) {
            throw new NullPointerException("获取推送数据失败！");
        }
        weatherDto = (WeatherDto) arg;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current:" + weatherDto.toString());
    }

    public void showSubjects() {
        System.out.print("订阅列表：");
        for (Subject subject : subjectList) {
            System.out.print(" " + ((DefaultSubject)subject).getName());
        }
        System.out.println();
    }
}
