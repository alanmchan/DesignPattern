package pattern.adapter.interfaceAdapter;

abstract class AdapterUSB2VGA implements VGA {
    USB usb = new USBImpl();

    @Override
    public void projection() {
        usb.show();
    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }
}
