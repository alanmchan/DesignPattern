package pattern.singleton.singleton4;

/**
 * 单例模式
 *
 * 懒汉式，同步方法
 *
 * 但是同步粒度大，效率低
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    // 这种同步的粒度极大，效率低
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
