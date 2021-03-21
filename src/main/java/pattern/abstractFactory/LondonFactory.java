package pattern.abstractFactory;

public class LondonFactory implements Factory{
    @Override
    public Pizza createPizza() {
        System.out.println("LD Factory making Pizza");
        return new CheesePizza();
    }

    @Override
    public Hamburger createHamburger() {
        System.out.println("LD Factory baking Hamburger");
        return new BeefHamburger();
    }
}
