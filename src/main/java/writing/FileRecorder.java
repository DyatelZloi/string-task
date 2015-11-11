package main.java.writing;

/**
 * Created by DiZi on 10.11.2015.
 */
public class FileRecorder {
    private Recorder write;

    public void setStrategy(Recorder write) {
        this.write = write;
    }

    public void readFile (String string) {
        write.write(string);
    }
}