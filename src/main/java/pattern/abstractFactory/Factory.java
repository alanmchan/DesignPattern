package pattern.abstractFactory;

/**
 * 抽象工厂
 *
 * 有多个方法，分别生产不同等级的产品
 */
public interface Factory {
    public Pizza createPizza();

    public Hamburger createHamburger();
}
