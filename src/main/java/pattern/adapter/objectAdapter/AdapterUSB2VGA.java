package pattern.adapter.objectAdapter;

public class AdapterUSB2VGA implements VGA{
    private USB usb;

    public AdapterUSB2VGA(USB usb) {
        this.usb = usb;
    }

    @Override
    public void projection() {
        usb.show();
    }
}
