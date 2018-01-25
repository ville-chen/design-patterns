package observer.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by admin on 2018/1/25.
 * 天气数据
 */
@Data
public class WeatherDto implements Serializable {

    private static final long serialVersionUID = -3657467194870663455L;

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public String toString() {
        return temperature + "F degrees and " + humidity + "% humidity" + pressure + "P";
    }
}
