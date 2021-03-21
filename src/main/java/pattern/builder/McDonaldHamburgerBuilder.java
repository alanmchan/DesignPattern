package pattern.builder;

public class McDonaldHamburgerBuilder implements HamburgerBuilder{
    @Override
    public void buildBread() {
        hamburger.addBread("White");
    }

    @Override
    public void buildMeat() {
        hamburger.addMeat("Chicken");
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
