package pattern.adapter.classAdapter;

import org.junit.Test;

public class AdapterUSBImpl2VGATest {
    @Test
    public void test() {
        VGA vga = new AdapterUSB2VGA();
        vga.projection();
    }
}
