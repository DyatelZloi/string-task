package main.java.reading;

import java.nio.file.Path;
import java.util.List;

/**
 * Created by DiZi on 10.11.2015.
 */
public class Read  {
    private Reader read;

    public void setStrategy(Reader read) {
        this.read = read;
    }

    public List<String> readFile (Path filePath) throws ReadingException {
        return read.readFile(filePath);
    }
}
