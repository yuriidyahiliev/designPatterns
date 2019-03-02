package decorator;

public class HondaSuperCar extends AbstractHondaDecorator {
    public HondaSuperCar(Car car) {
        super(car);
    }

    @Override
    public void drive() {
        car.drive();
        accelerate();
    }

    private void accelerate() {
        System.out.println("Driving with high speed");
    }
}
