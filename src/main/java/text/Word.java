package main.java.text;

import main.java.sorting.SortByIndex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by DiZi on 10.11.2015.
 */

public class Word extends LetterWord implements Iterable <Component> {

    public Word(List<Component> symbols){
        this.setmChildGraphics(symbols);
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
        return "Word{"+ getmChildGraphics() +
                '}';
    }

    public List<Component> getSymbols() {
        return getmChildGraphics();
    }

    @Override
    public Iterator<Component> iterator() {
        // TODO Auto-generated method stub
        return this.getmChildGraphics().iterator();
    }

    public void palindrome(){
        for (Component sentence : this.getmChildGraphics()) {
            sentence.palindrome();
        }
    }
}
