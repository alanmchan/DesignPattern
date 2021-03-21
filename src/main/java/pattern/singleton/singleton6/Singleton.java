package pattern.singleton.singleton6;

/**
 * 单例模式
 *
 * 懒汉式，双重检查
 */
public class Singleton {
    // 修改立即更新到主存, 防止重排序
    private static volatile Singleton singleton;

    private Singleton () {}

    // 解决线程安全和懒加载
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
