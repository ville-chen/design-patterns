package observer.subject;

import lombok.Data;
import observer.dto.WeatherDto;
import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/1/25.
 * 实现接口的气象站
 */
@Data
public class DefaultSubject implements Subject {

    private String name;
    private boolean changed;
    /**
     * 已经订阅的的观察者集
     */
    private List<Observer> observerList;
    /**
     * 天气数据类 数据交互实体
     */
    private WeatherDto weatherDto;

    public DefaultSubject() {
        this.observerList = new ArrayList<>();
        this.weatherDto = new WeatherDto();
    }

    @Override
    public synchronized void registerObserver(Observer observer) {
        if (null == observer) {
            throw new NullPointerException();
        }
        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public synchronized void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        notifyObservers(null);
    }

    @Override
    public void notifyObservers(Object obj) {
        synchronized (this) {
            if (!hasChanged()) {
                return;
            }
            clearChanged();
        }
        for (Observer observer : observerList) {
            //主题利用观察者接口通知观察者
            observer.update(this, obj);
        }
    }

    protected synchronized void setChanged() {
        changed = true;
    }

    protected synchronized void clearChanged() {
        changed = false;
    }

    private synchronized boolean hasChanged() {
        return changed;
    }

    protected synchronized int countObservers() {
        return observerList.size();
    }

    /**
     * 更新测量数据
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        weatherDto.setTemperature(temperature);
        weatherDto.setHumidity(humidity);
        weatherDto.setPressure(pressure);

        //if 数据变化较大需要更新
        this.setChanged();
        measurementsChanged();
    }

    /**
     * 数据更新，通知观察者
     */
    private void measurementsChanged() {
        //拉推方式二选一
        //拉
        //this.notifyObservers();
        //推
        this.notifyObservers(weatherDto);
    }
}
