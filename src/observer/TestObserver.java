package observer;

import observer.observer.CurrentConditionsDisplay;
import observer.observer.ForecastDisplay;
import observer.observer.StatisticsDisplay;
import observer.subject.DefaultSubject;
import observer.subject.WeatherStation;

/**
 * Created by admin on 2018/1/25.
 * 观察者模式 测试类
 */
public class TestObserver {
    public static void main(String[] args) {
        //推送信息的气象站
        DefaultSubject postStation = new DefaultSubject();
        postStation.setName("postStation");
        //拉取信息的气象站
        WeatherStation pullStation = new WeatherStation();
        pullStation.setName("pullStation");

        //布告栏
        CurrentConditionsDisplay ccDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        //订阅
        ccDisplay.subscribe(postStation);
        forecastDisplay.subscribe(pullStation);
        statisticsDisplay.subscribe(pullStation);

        postStation.setMeasurements(80f, 65f, 30.4f);
        ccDisplay.showSubjects();

        pullStation.setMeasurements(82f, 70f, 29.2f);

        pullStation.setMeasurements(78f, 90f, 29.2f);

    }
}
