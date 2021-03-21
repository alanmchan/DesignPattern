package pattern.builder;

/**
 * 具体产品
 */
public class Hamburger {
    private String bread;
    private String meat;
    private String vegetable;

    public void addBread(String bread) {
        this.bread = bread;
    }

    public void addMeat(String meat) {
        this.meat = meat;
    }

    public void addVegetable(String vegetable) {
        this.vegetable = vegetable;
    }

    public String toString() {
        return "Hamburger(" + this.bread + " + " + this.meat + " + " + this.vegetable + ")";
    }
}
