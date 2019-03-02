import fabric_method.Bottle;
import fabric_method.BottleFactory;
import fabric_method.Employee;
import org.junit.Test;

public class FabricMethodTest {

    @Test
    public void testFabricMethod() {
        Bottle bottle = new BottleFactory().create("Pepsi");
        bottle.drink();
    }

    @Test
    public void testFabricMethodEmployee() {
        Employee employee = Employee.create();
    }
}
