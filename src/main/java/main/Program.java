package main.java.main;

import ch.qos.logback.classic.Logger;
import main.java.Parsing.Parse;
import main.java.reading.AllLinesReader;
import main.java.reading.Read;
import main.java.reading.ReadingException;
import main.java.text.Component;
import main.java.text.Symbol;
import main.java.text.Text;
import main.java.text.Word;
import main.java.writing.ConsoleRecorder;
import main.java.writing.FileRecorder;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by DiZi on 10.11.2015.
 */

public class Program {

    public static void main(String[] args) throws ReadingException {

        List<Component> list = new ArrayList<Component>();
        list.add(new Symbol('a'));
        list.add(new Symbol('a'));
        list.add(new Symbol('a'));
        list.add(new Symbol('a'));
        list.add(new Symbol('a'));

        Read reading = new Read();
        reading.setStrategy(new AllLinesReader());
        Path path = Paths.get("./test.txt");
        reading.readFile(path);

        Parse prepare = new Parse();
        List<String> textFile = reading.readFile(path);
        Text text = new Text(prepare.findProposal(textFile));

        FileRecorder write = new FileRecorder();
        write.setStrategy(new ConsoleRecorder());
        write.readFile(text.toString());

        text.palindrome();
    }
}
