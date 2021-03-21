package pattern.simpleFactory;

/**
 * 具体产品
 */
public class PepperPizza implements Pizza{
    @Override
    public void show() {
        System.out.println("Pepper Pizza");
    }
}
