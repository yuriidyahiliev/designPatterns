package abstract_factory;

public class NoteBookFactory implements DeviceFactory {

    public NoteBook create(String noteBook) {
        switch (noteBook) {
            case "Macbook": return new MacBook();
            case "Lenovo": return new Lenovo();
            case "Asus": return new Asus();
            default: return null;
        }
    }
}
