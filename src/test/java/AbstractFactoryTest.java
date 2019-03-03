import abstract_factory.AbstractDeviceFactory;
import abstract_factory.DeviceFactory;
import abstract_factory.NoteBook;
import abstract_factory.Phone;
import org.junit.Test;

@SuppressWarnings("unchecked")
public class AbstractFactoryTest {

    @Test
    public void testAbstractFactoryTest() {
        DeviceFactory<DeviceFactory> factory = new AbstractDeviceFactory();
        DeviceFactory<Phone> phoneDeviceFactory = factory.create("Phone");
        DeviceFactory<NoteBook> noteBookDeviceFactory = factory.create("Notebook");
        Phone phone = phoneDeviceFactory.create("Iphone");
        phone.ring();

        NoteBook noteBook = noteBookDeviceFactory.create("Macbook");
        noteBook.writeCode();
    }
}
