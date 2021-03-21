package pattern.factory;

/**
 * 具体工厂
 *
 * 一个工厂生产一种产品
 */
public class CheeseFactory implements Factory{
    @Override
    public Pizza createPizza() {
        System.out.println("Make Cheese Pizza");
        return new CheesePizza();
    }
}
