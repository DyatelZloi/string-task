package main.java.writing;

/**
 * Created by DiZi on 10.11.2015.
 */
public class ConsoleRecorder implements Recorder{
    @Override
    public void write(String string) {
        System.out.println(string);
    }
}