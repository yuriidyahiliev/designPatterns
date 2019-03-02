import facade.FileReadFacade;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FacadeTest {

    @Test
    public void facadeTest() throws IOException {
        FileReadFacade fileReadFacade = new FileReadFacade();
        String fileName = fileReadFacade.getFileName(new File(""));
        System.out.println(fileName);
    }
}
