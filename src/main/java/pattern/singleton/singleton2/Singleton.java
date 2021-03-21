package pattern.singleton.singleton2;

/**
 * 单例模式
 *
 * 饿汉式，静态代码块
 *
 * 线程安全
 */
class Singleton {
    // 1. 构造器私有化
    private Singleton() {
    }

    private static Singleton instance;

    // 2. 内部创建对象实例: 在静态代码块中创建单例对象
    static {
        instance = new Singleton();
    }

    // 3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}