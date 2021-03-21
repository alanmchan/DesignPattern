package pattern.singleton.singleton1;

/**
 * 单例模式
 *
 * 饿汉式，静态常量
 *
 * 线程安全
 */
class Singleton {
    // 1. 构造器私有化
    private Singleton() {
    }

    // 2. 内部创建对象实例
    private final static Singleton instance = new Singleton();

    // 3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
