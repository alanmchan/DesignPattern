package pattern.simpleFactory;

/**
 * 具体产品
 */
public class CheesePizza implements Pizza {
    @Override
    public void show() {
        System.out.println("Cheese Pizza");
    }
}
