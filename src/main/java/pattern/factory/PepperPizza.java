package pattern.factory;

/**
 * 具体产品
 */
public class PepperPizza implements Pizza {
    @Override
    public void show() {
        System.out.println("Pepper Pizza");
    }
}
