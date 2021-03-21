package pattern.singleton.singleton5;

/**
 * 单例模式
 *
 * 懒汉式，同步代码块
 *
 * 线程不安全
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {// 这里还是会引发线程安全问题，几个线程都进来后，依次获得锁，再依次创建多个实例
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
