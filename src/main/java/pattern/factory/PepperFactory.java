package pattern.factory;

/**
 * 具体工厂
 *
 * 一个工厂生产一种产品
 */
public class PepperFactory implements Factory{
    @Override
    public Pizza createPizza() {
        System.out.println("Make Pepper Pizza");
        return new PepperPizza();
    }
}
