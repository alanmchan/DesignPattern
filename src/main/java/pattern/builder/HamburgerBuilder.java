package pattern.builder;

/**
 * 抽象建造者
 */
public interface HamburgerBuilder {
    Hamburger hamburger = new Hamburger();

    public void buildBread();

    public void buildMeat();

    public void buildVegetable();

    public Hamburger buildHamburger();
}
