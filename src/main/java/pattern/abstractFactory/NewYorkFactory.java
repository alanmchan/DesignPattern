package pattern.abstractFactory;

public class NewYorkFactory implements Factory{
    @Override
    public Pizza createPizza() {
        System.out.println("NY Factory making pizza");
        return new PepperPizza();
    }

    @Override
    public Hamburger createHamburger() {
        System.out.println("NY Factory baking hamburger");
        return new ChickenHamburger();
    }
}
