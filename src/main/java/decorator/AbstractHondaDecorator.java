package decorator;

public abstract class AbstractHondaDecorator implements Car {
    protected Car car;

    public AbstractHondaDecorator(Car car) {
        this.car = car;
    }

    public abstract void drive();
}
