package pattern.simpleFactory;

import org.junit.Test;

public class SimpleFactoryTest {
    @Test
    public void test() {
        SimpleFactory simpleFactory = new SimpleFactory();
        Pizza pizza = simpleFactory.createPizza("cheese");
        pizza.show();
    }
}
