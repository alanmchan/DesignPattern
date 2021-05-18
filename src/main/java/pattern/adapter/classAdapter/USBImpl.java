package pattern.adapter.classAdapter;

public class USBImpl implements USB {
    @Override
    public void show() {
        System.out.println("show files and folders");
    }
}
