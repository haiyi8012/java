package test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TIterator {
	public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); //("apple", "pear", "banana");
        list.add("apple");
        list.add("pear");
        list.add("banana");

        for (String s : list) {
            System.out.println("for each::"+s);
        }

        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println("Iterator ::"+s);
        }
    }
}