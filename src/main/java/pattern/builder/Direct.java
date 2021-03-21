package pattern.builder;

/**
 * 指挥者
 */
public class Direct {
    private HamburgerBuilder hamburgerBuilder;

    public Direct(HamburgerBuilder hamburgerBuilder) {
        this.hamburgerBuilder = hamburgerBuilder;
    }

    public Hamburger build() {
        this.hamburgerBuilder.buildBread();
        this.hamburgerBuilder.buildMeat();
        this.hamburgerBuilder.buildVegetable();
        return this.hamburgerBuilder.buildHamburger();
    }
}
