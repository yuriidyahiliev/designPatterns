package abstract_factory;

public class AbstractDeviceFactory implements DeviceFactory {
    public DeviceFactory create(String typeOfFactory) {
        switch (typeOfFactory) {
            case "Phone": return new PhoneFactory();
            case "Notebook": return new NoteBookFactory();
            default: return null;
        }
    }
}
