package main.java.text;

import java.util.List;

/**
 * Created by DiZi on 10.11.2015.
 */
public class Symbol implements Component {

    private char value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Symbol symbol = (Symbol) o;

        return value == symbol.value;

    }

    @Override
    public int hashCode() {
        return (int) value;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "value='" + value + '\'' +
                '}';
    }

    public Symbol(char value) {
        this.value = value;
    }

    public void print() {
        System.out.println(this.value);
    }

    @Override
    public void palindrome() {
        System.out.println("OK");
    }
}
