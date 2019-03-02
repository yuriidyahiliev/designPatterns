package abstract_factory;

public interface DeviceFactory  {
    Phone createPhone(String typeOfPhone);
    NoteBook createNoteBook(String typeOfNotebook);
}
