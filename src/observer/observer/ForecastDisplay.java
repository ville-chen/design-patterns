package observer.observer;

import observer.dto.WeatherDto;
import observer.subject.Subject;
import observer.subject.WeatherStation;
import observer.thirdparty.DisplayElement;

/**
 * Created by admin on 2018/1/24.
 * 观察者类型：气压布告栏，拉取获取数据
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;

    @Override
    public void subscribe(Subject subject) {
        //观察者利用主题接口向主题注册
        subject.registerObserver(this);
    }

    @Override
    public void update(Subject subject, Object arg) {
        if (subject instanceof WeatherStation) {
            WeatherStation weatherStation = (WeatherStation) subject;
            WeatherDto weatherDto = weatherStation.getWeatherDto();
            lastPressure = currentPressure;
            currentPressure = weatherDto.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
