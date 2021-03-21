package pattern.simpleFactory;

/**
 * 简单工厂
 *
 * 一个工厂生产同一等级的多个产品
 */
public class SimpleFactory {
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza();
        } else if ("pepper".equals(type)) {
            return new PepperPizza();
        } else {
            return null;
        }
    }
}
