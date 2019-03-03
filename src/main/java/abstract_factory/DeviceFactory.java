package abstract_factory;

public interface DeviceFactory<T>  {
    T create(String typeOfDevice);
}
