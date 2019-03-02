package abstract_factory;

public class Iphone implements Phone {
    @Override
    public void ring() {
        System.out.println("Ring on iPhone");
    }
}
