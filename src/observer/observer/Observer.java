package observer.observer;

import observer.subject.Subject;

/**
 * Created by admin on 2018/1/24.
 * 观察者接口
 */
public interface Observer {

    /**
     * 订阅主题
     */
    void subscribe(Subject subject);

    void update(Subject subject, Object arg);
}
