package fabric_method;

public class BottleFactory implements Bottle {

    public Bottle create(String typeOfBottle) {
        switch (typeOfBottle) {
            case "Pepsi": return new Pepsi();
            case "Cola": return new Cola();
            case "Fanta": return new Fanta();
            default: return null;
        }
    }

    @Override
    public void drink() {
    }
}
