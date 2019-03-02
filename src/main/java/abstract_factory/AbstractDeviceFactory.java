package abstract_factory;

public class AbstractDeviceFactory {
    public DeviceFactory createFactory(String typeOfFactory) {
        switch (typeOfFactory) {
            case "Phone": return new PhoneFactory();
            case "Notebook": return new NoteBookFactory();
            default: return null;
        }
    }
}
