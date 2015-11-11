package main.java.text;

import java.util.List;

/**
 * Created by DiZi on 10.11.2015.
 */
public class Paragraph extends LetterWord{
    public Paragraph(List<Component> words){
        this.setmChildGraphics(words);
    }
}
