package main.java.text;

import java.util.List;

/**
 * Created by DiZi on 10.11.2015.
 */
interface Composite extends Component {

    void add(Component component);//

    void remove(Component component);//

    void palindrome();
}