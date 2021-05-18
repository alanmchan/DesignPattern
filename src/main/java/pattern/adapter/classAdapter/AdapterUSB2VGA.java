package pattern.adapter.classAdapter;

public class AdapterUSB2VGA extends USBImpl implements VGA{
    @Override
    public void projection() {
        super.show();
    }
}
