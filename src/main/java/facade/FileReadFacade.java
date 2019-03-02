package facade;

import java.io.File;

public class FileReadFacade {
    public String getFileName(File file) {
        if (file.isFile() && file.exists()) {
            return file.getName();
        } else {
            return "There is no file";
        }
    }
}
