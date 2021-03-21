package pattern.prototype;

import org.junit.Test;

public class PrototypeTest {
    @Test
    public void test() throws CloneNotSupportedException {
        Sheep sheep = new Sheep("doli", 10);
        Sheep sheep1 = (Sheep)sheep.clone(); // 完成克隆
    }
}
