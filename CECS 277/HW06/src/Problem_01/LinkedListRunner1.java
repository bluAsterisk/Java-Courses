package Problem_01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListRunner1 {

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("aaa");
        l.add("bbb");
        l.add("ccc");
        l.add("ddd");
        l.add("eee");
        l.add("fff");
        l.add("ggg");
        l.add("hhh");
        l.add("iii");
        ListIterator<String> iter = (ListIterator<String>) l.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
        System.out.println();
        while (iter.hasPrevious()){
            String s = iter.previous();
            if (s.startsWith("a") || s.startsWith("e") || s.startsWith("i") || s.startsWith("o") || s.startsWith("u"))
                iter.remove();
        }
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}