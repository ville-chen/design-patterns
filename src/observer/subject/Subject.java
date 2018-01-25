package observer.subject;

import observer.observer.Observer;

/**
 * Created by admin on 2018/1/24.
 * 主题接口
 */
public interface Subject {

    /**
     * 注册为观察者
     * @param observer 注册对象
     */
    void registerObserver(Observer observer);

    /**
     * 取消注册
     * @param observer 取关对象
     */
    void removeObserver(Observer observer);

    /**
     * 拉取方式传递数据
     */
    void notifyObservers();

    /**
     * 推送方式传递数据
     * @param obj 数据对象
     */
    void notifyObservers(Object obj);
}
