package pattern.builder;

import org.junit.Test;

public class BuilderTest {
    @Test
    public void test() {
        Direct direct = new Direct(new KFCHamburgerBuilder());
        Hamburger hamburger = direct.build();
        System.out.println(hamburger);
    }
}
