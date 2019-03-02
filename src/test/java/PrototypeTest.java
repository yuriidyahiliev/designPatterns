import org.junit.Test;
import prototype.Credentials;
import prototype.User;

public class PrototypeTest {

    @Test
    public void prototypeTest() {
        Credentials credentials = new Credentials();
        credentials.setUser(new User());
    }
}
