import abstract_factory.AbstractDeviceFactory;
import abstract_factory.DeviceFactory;
import abstract_factory.NoteBook;
import abstract_factory.Phone;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void testAbstractFactoryTest() {
        DeviceFactory phoneFactory = new AbstractDeviceFactory().createFactory("Phone");
        DeviceFactory noteBookFactory = new AbstractDeviceFactory().createFactory("Notebook");
        Phone phone = phoneFactory.createPhone("Iphone");
        NoteBook noteBook = noteBookFactory.createNoteBook("Macbook");
        phone.ring();
        noteBook.writeCode();
    }
}
