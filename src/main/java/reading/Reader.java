package main.java.reading;

import java.nio.file.Path;
import java.util.List;

/**
 * Created by DiZi on 10.11.2015.
 */
public interface Reader {
    public List<String> readFile(Path filePath) throws ReadingException;
}