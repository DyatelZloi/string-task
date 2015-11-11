package main.java.Parsing;

import main.java.text.Component;
import main.java.text.Sentence;
import main.java.text.Symbol;
import main.java.text.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DiZi on 10.11.2015.
 */
public class Parse {
    public List<Component> findSymbols(Pattern findPattern, String lines){
        List <Component> returnList = new ArrayList<Component>();
        String line = lines;
        Matcher matcher = findPattern.matcher(line);
        while (matcher.find()) {
            returnList.add(new Symbol(matcher.group().charAt(0)));
        }
        return returnList;
    }

    public static List <String> searchForTheLine2(Pattern findPattern, String lines){
        List <String> returnList = new ArrayList <String>();
        String line = lines;
        Matcher matcher = findPattern.matcher(line);
        while (matcher.find()) {
            returnList.add(matcher.group());
        }
        return returnList;
    }

    public List <Component> findWords(Pattern findPattern, List<String> lines){
        List<Component> returnList = new ArrayList<Component>();
        Pattern forSymbol = Pattern.compile("[\\S*]");
        Pattern forWords = Pattern.compile("(\\S*[\\s])");
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            Matcher matcher = forWords.matcher(line);
            while (matcher.find()) {
                returnList.add(new Word(findSymbols(forSymbol, matcher.group())));
            }
        }
        return returnList;
    }

    public List <Component> findProposal(List<String> lines){
        List<Component> returnStatment = new ArrayList<Component>();
        Pattern forWords = Pattern.compile("(\\S*[\\s])");
        Pattern forProposal = Pattern.compile("([^.!?]*([.]{3}|[.!?]))" );
        for (int i = 0; i < lines.size(); i++) {
            String x = lines.get(i);
            Matcher m2 = forProposal.matcher(x);
            while (m2.find()) {
                returnStatment.add(new Sentence(findWords(forWords, Parse.searchForTheLine2(forWords, m2.group()))));
            }
        }
        return returnStatment;
    }
}
