package Problem_01;
import java.util.PriorityQueue;

public class PriorityQueueRunner {
	public static void main(String[] args) {

        PriorityQueue<Person> pq = new PriorityQueue<>();
        pq.add(new Person("Roderick", "Strong"));
        pq.add(new Person("Kyle", "O'Reily"));
        pq.add(new Person("Adam", "Cole"));
        pq.add(new Person("Bobby", "Fish"));

        // returns names in alphabetical order by first name
        System.out.println(pq);

        Person a = new Person("Johnny", "Gargano");
        Person b = new Person("Tomasso", "Ciampa");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.getFirstName());
        System.out.println(b.getLastName());
        System.out.println(a.toString());
        System.out.println(a.compareTo(b));
    }
}
