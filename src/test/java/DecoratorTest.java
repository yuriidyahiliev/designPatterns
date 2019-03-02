import decorator.Car;
import decorator.HondaCar;
import decorator.HondaSuperCar;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void testDecorator() {
        Car car = new HondaSuperCar(new HondaCar());
        car.drive();
    }
}
