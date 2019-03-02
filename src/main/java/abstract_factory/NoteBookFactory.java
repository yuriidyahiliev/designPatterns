package abstract_factory;

public class NoteBookFactory implements DeviceFactory {
    @Override
    public Phone createPhone(String typeOfPhone) {
        return null;
    }

    public NoteBook createNoteBook(String noteBook) {
        switch (noteBook) {
            case "Macbook": return new MacBook();
            case "Lenovo": return new Lenovo();
            case "Asus": return new Asus();
            default: return null;
        }
    }
}
