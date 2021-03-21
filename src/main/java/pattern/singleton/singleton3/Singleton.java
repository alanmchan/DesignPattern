package pattern.singleton.singleton3;

/**
 * 单例模式
 *
 * 懒汉式，线程不安全
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
