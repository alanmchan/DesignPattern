package pattern.singleton.singleton7;

/**
 * 单例模式
 *
 * 静态内部类
 */
public class Singleton {
    private static Singleton singleton;

    // 构造器私有化
    private Singleton() {
    }

    // 写一个静态内部类，该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final Singleton SINGLETON = new Singleton();
    }

    // 提供一个静态的公有方法
    public static Singleton getInstance() {
        return SingletonInstance.SINGLETON;
    }

}
