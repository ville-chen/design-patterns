package observer.subject;

import observer.dto.WeatherDto;

/**
 * Created by admin on 2018/1/25.
 * 继承DefaultSubject的气象站
 */
public class WeatherStation extends DefaultSubject {

    public WeatherDto weatherDto;

    public WeatherDto getWeatherDto() {
        return weatherDto;
    }

    public WeatherStation() {
        weatherDto = new WeatherDto();
    }

    /**
     * 数据更新，通知观察者
     */
    private void measurementsChanged() {
        //拉推方式二选一
        //拉
        super.notifyObservers();
        //推
        //super.notifyObservers(weatherDto);
        super.clearChanged();
    }

    /**
     * 更新测量数据
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        weatherDto.setTemperature(temperature);
        weatherDto.setHumidity(humidity);
        weatherDto.setPressure(pressure);

        //if 数据变化较大需要更新
        super.setChanged();
        measurementsChanged();
    }
}
