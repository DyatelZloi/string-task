package main.java.text;

import java.util.List;

/**
 * Created by DiZi on 10.11.2015.
 */

public class Text extends LetterWord{
        public Text(List<Component> paragraph){
            this.setmChildGraphics(paragraph);
        }

    public void palindrome(){
    for (Component sentence : this.getmChildGraphics()) {
        sentence.palindrome();
        }
    }

    //public void palindrome(){
    //    List<Word> palindrome = new ArrayList();
    //    List <Word> palindrome2 = new ArrayList();
    //    for (Sentence sentence : this.getmChildGraphics()){
    //        for (Component words : sentence) {
    //            if (!words.equals(Word.class)) {
//
    //            }
    //            if (words.palindrome()) {
    //                palindrome.add(words);
    //            } else {
    //                if (palindrome.size() >= palindrome2.size()) {
    //                    palindrome2.clear();
    //                    palindrome2.addAll(palindrome);
    //                }
    //                palindrome.clear();
    //            }
    //        }
    //        }
    //          System.out.println(palindrome2);
    //}

}
