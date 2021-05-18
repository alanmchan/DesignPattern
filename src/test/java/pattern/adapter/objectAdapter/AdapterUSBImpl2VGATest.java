package pattern.adapter.objectAdapter;

import org.junit.Test;

public class AdapterUSBImpl2VGATest {
    @Test
    public void test() {
        USB usb = new USBImpl();
        VGA vga = new AdapterUSB2VGA(usb);
        vga.projection();
    }
}
