package pattern.builder;

/**
 * 具体建造者
 */
public class KFCHamburgerBuilder implements HamburgerBuilder{
    @Override
    public void buildBread() {
        hamburger.addBread("Black");
    }

    @Override
    public void buildMeat() {
        hamburger.addMeat("Beef");
    }

    @Override
    public void buildVegetable() {
        hamburger.addVegetable("Cabbage");
    }

    @Override
    public Hamburger buildHamburger() {
        return hamburger;
    }
}
