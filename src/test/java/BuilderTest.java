import builder.House;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void testBuilder() {
        House house = new House
                .Builder("1, test street")
                .setDoors(5)
                .setStages(2)
                .setWindows(5)
                .build();

        System.out.println(house.toString());
    }
}
