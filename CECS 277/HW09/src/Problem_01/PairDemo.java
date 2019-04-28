package Problem_01;
import java.awt.Rectangle;
import java.util.TreeSet;

public class PairDemo {
	public static void main(String args[])
	{
		TreeSet<Pair> mySet = new TreeSet<Pair>();
		
		mySet.add(new Pair("Brown", "Sally"));
        mySet.add(new Pair("Kelly", "Fred"));
        mySet.add(new Pair("Brown", "Bill"));
        mySet.add(new Pair("Wilkins", "Julie"));
        mySet.add(new Pair("Langdon", "James"));
        
        // 1.2 <String, int>
        /*
		mySet.add(new Pair("Brown", 11));
        mySet.add(new Pair("Kelly", -2));
        mySet.add(new Pair("Brown", 3));
        mySet.add(new Pair("Wilkins", 7));
        mySet.add(new Pair("Langdon", 22));
        /*
		// <String, Rectangle>
		Rectangle r0 = new Rectangle(2, 5);
		Rectangle r1 = new Rectangle(7, 3);
		Rectangle r2 = new Rectangle(1, 6);
		Rectangle r3 = new Rectangle(3, 5);
		Rectangle r4 = new Rectangle(3, 9);
        mySet.add(new Pair("Brown", r0));
        mySet.add(new Pair("Kelly", r1));
        mySet.add(new Pair("Brown", r2));
        mySet.add(new Pair("Wilkins", r3));
        mySet.add(new Pair("Langdon", r4));
        */ // Rectangle class didn't work
        for (Pair p : mySet){
            System.out.print(p.getFirst() + " ");
            System.out.println(p.getSecond());
        }
	}
}
