package observer.subject;

/**
 * Created by admin on 2018/1/25.
 * 继承DefaultSubject的气象站
 */
public class WeatherStation extends DefaultSubject {

    /**
     * 数据更新，通知观察者
     */
    private void measurementsChanged() {
        //拉推方式二选一
        //拉
        super.notifyObservers();
        //推
        //super.notifyObservers(weatherDto);
    }
}
