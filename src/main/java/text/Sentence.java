package main.java.text;

import java.util.Iterator;
import java.util.List;

/**
 * Created by DiZi on 10.11.2015.
 */
public class Sentence extends LetterWord implements Iterable <Component> {

    public Sentence(List<Component> words){
        this.setmChildGraphics(words);
    }

    public void add(Component component) {
        this.getmChildGraphics().add(component);
    }

    public void remove(Component component) {
        this.getmChildGraphics().remove(component);
    }

    public void print() {
        for (Component component : getmChildGraphics()) {
            component.print();
        }
    }

    @Override
    public String toString() {
        return "Sentence{" + getmChildGraphics() +
                '}';
    }

    @Override
    public Iterator<Component> iterator() {
        return this.getmChildGraphics().iterator();
    }

    public void palindrome(){
        for (Component sentence : this.getmChildGraphics()) {
            sentence.palindrome();
        }
    }
}