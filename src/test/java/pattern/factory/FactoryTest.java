package pattern.factory;

import org.junit.Test;

public class FactoryTest {
    @Test
    public void test() {
        Factory factory1 = new CheeseFactory();
        Pizza pizza = factory1.createPizza();
        pizza.show();

        Factory factory2 = new PepperFactory();
        Pizza pizza1 = factory2.createPizza();
        pizza1.show();
    }
}
