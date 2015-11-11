package main.java.reading;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by DiZi on 10.11.2015.
 */
public class AllLinesReader implements Reader {

    public List<String> readFile(Path filePath) throws ReadingException {
        List<String> text = null;
        try {
            text = Files.readAllLines(filePath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new ReadingException("Error reading file.", e);
        }
        return text;
    }
}