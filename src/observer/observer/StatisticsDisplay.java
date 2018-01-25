package observer.observer;

import observer.subject.Subject;
import observer.subject.WeatherStation;
import observer.thirdparty.DisplayElement;

/**
 * Created by admin on 2018/1/24.
 * 观察者类型：统计最值，平均值布告栏
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;

    @Override
    public void subscribe(Subject subject) {
        //观察者利用主题接口向主题注册
        subject.registerObserver(this);
    }

    @Override
    public void update(Subject subject, Object arg) {
        if (subject instanceof WeatherStation) {
            WeatherStation weatherStation = (WeatherStation) subject;
            float temp = weatherStation.getWeatherDto().getTemperature();
            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Statistics: Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
