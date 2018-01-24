package observer.observable;

import observer.observer.Observer;

/**
 * Created by admin on 2018/1/24.
 * 主题接口
 */
public interface Observable {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
