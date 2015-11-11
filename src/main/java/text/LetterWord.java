package main.java.text;

import main.java.sorting.SortByIndex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by DiZi on 10.11.2015.
 */
public abstract class LetterWord implements Composite {

    public void setmChildGraphics(List<Component> mChildGraphics) {
        this.mChildGraphics = mChildGraphics;
    }

    List<Component> getmChildGraphics() {
        return mChildGraphics;
    }

    private List<Component> mChildGraphics = new ArrayList<Component>();

    @Override
    public String toString() {
        return "LetterWord{" +
                "mChildGraphics=" + mChildGraphics +
                '}';
    }

    public void add(Component component) {
    }

    public void remove(Component component) {
    }

    public boolean palindromeWord() {
        List listWords = new ArrayList(this.getmChildGraphics());
        Word palindrome = new Word(listWords);
        Collections.sort(palindrome.getSymbols(), new SortByIndex());
        return this.equals(palindrome);
    }

    public void palindrome() {
        for (Component component: this.getmChildGraphics()){
            if (component.getClass() == Text.class){
                for (Component component2 : component){
                    if (component2.getClass() == Sentence.class){
                        for (Component component3 : component2){

                        }
                    }
                }
            }
        }
    }

    public void print() {
    }
}
