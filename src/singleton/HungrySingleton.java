package singleton;

/**
 * 单例模式:大家公用一个实例
 * 特点： 1.类内部有存放自己实例的属性
 *       2.构造函数私有化
 *       3.对外提供公共的静态getInstance()方法,用于获取唯一实例的方法
 *
 * 单例模式两种形式:
 * 1.饿汉：在类加载时就将唯一的实例对象创建了;
 * 2.懒汉: 延迟加载实例,当需要使用时才创建;
 *  懒汉情况下多线程访问容易出现安全问题；可以加同步解决,通过双重判断可以降低synchronized影响;
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
