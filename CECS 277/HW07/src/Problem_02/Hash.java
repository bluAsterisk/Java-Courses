package Problem_02;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Hash {

    public static void main(String[] args) {

        // Sue's friends
        LinkedList<String> SueFriends = new LinkedList<>();
        SueFriends.add("Bob");
        SueFriends.add("Jose");
        SueFriends.add("Alex");
        SueFriends.add("Cathy");

        // Cathy's friends
        LinkedList<String> CathyFriends = new LinkedList<>();
        CathyFriends.add("Bob");
        CathyFriends.add("Alex");

        // Bob's friends
        LinkedList<String> BobFriends = new LinkedList<>();
        BobFriends.add("Alex");
        BobFriends.add("Jose");
        BobFriends.add("Jerry");

        HashMap<String, LinkedList<String>> map = new HashMap<>();
        map.put("Sue", SueFriends);
        map.put("Cathy", CathyFriends);
        map.put("Bob", BobFriends);

        Scanner in = new Scanner(System.in);

        System.out.println("1) Sue\n2) Cathy\n3) Bob");
        String choice = in.next();
        if (choice.contains("Sue")){

            System.out.println( map.get("Sue"));
        }
        else if (choice.contains("Cathy")){

            System.out.println( map.get("Cathy"));
        }
        else if (choice.contains("Bob")){

            System.out.println( map.get("Bob"));
        }
        else{
        		System.out.println("Name not found");
        }
    }

}
