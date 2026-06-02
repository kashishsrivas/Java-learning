package collec;

//Used to traverse collections.

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("kashish");
        names.add("vasu");

        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
