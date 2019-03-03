package abstract_factory;

public class PhoneFactory implements DeviceFactory {
    public Phone create(String phone) {
        switch (phone) {
            case "Iphone": return new Iphone();
            case "Xiaomi": return new Xiaomi();
            case "Samsung": return new Samsung();
            default: return null;
        }
    }
}
