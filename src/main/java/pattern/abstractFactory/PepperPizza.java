package pattern.abstractFactory;

/**
 * 具体产品
 *
 * 第一个产品等级
 */
public class PepperPizza implements Pizza {
    @Override
    public void show() {
        System.out.println("Pepper Pizza");
    }
}
