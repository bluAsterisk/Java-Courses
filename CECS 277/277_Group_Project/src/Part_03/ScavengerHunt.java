package Part_03;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Random;

public class ScavengerHunt {
	public static void main(String[] args) throws IOException
	{
		// 1
		Scanner console = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		LinkedList<String> ll = new LinkedList<String>();
		File inFile = new File("ScavengerList.txt");
		BufferedReader br = new BufferedReader(new FileReader(inFile));
		Scanner in = new Scanner(inFile);
		int key = 0;
		// ArrayList
		long startTime = System.nanoTime();
		String line = "";
		startTime = System.nanoTime();
		while ((line = br.readLine()) != null)
            al.add(line);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
		//System.out.println(al);
		System.out.println("Reading file into ArrayList took: " + duration  +" nanoseconds");
		br.close(); // Close the file
		// Reopen to read from top again
		br = new BufferedReader(new FileReader(inFile));
		
		// LinkedList
		startTime = System.nanoTime();
		while ((line = br.readLine()) != null)
            ll.add(line);
		endTime = System.nanoTime();
		duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
		//System.out.println(ll);
		System.out.println("Reading file into LinkedList took: " + duration + " nanoseconds");
		br.close();
		
		System.out.println("\nDisplaying Linked List:");
		ListIterator<String> iter1 = ll.listIterator();
		startTime = System.nanoTime();
        while (iter1.hasNext())
            System.out.println(iter1.next());
        System.out.println();
        while (iter1.hasPrevious())
            System.out.println(iter1.previous());
        endTime = System.nanoTime();
        duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("Iterating ArrayList took: " + duration + " nanoseconds");
		
        System.out.println("\nDisplaying Array List:");
        ListIterator<String> iter2 = al.listIterator();
        startTime = System.nanoTime();
        while (iter2.hasNext())
            System.out.println(iter2.next());
        System.out.println();
        while (iter2.hasPrevious())
            System.out.println(iter2.previous());
        endTime = System.nanoTime();
        duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("Iterating LinkedList took: " + duration + " nanoseconds");
        
        /*
        //Testing input and output of each list (Array List)
        System.out.print("\nEnter the amount of teams: ");
        int numOfTeams = console.nextInt();
        ArrayList shuffledLists = new ArrayList();
       
        for (int i = 0; i < numOfTeams; i++) {
            Collections.shuffle(al);
            shuffledLists.add(al);
            //System.out.println(shuffledLists);
            System.out.print("Enter a number to get an item from the list: ");
            int choice = console.nextInt();
            startTime = System.nanoTime();
            String item = al.get(choice);
            endTime = System.nanoTime();
            duration = (endTime - startTime);
            System.out.println("Your item is " + item);
            System.out.println("It took " + duration + " nanoseconds to retrieve " + item);
            System.out.print("Enter a string to add an item from the list: ");
            item = console.next();
            startTime = System.nanoTime();
            al.set(choice, item);
            endTime = System.nanoTime();
            duration = (endTime - startTime);
            //System.out.println("Your item is " + item);
            System.out.println("It took " + duration + " nanoseconds to add " + item + "\n");
            //System.out.println(al);
            
        }
        Random rand = new Random();
        int randomInt = rand.nextInt(100);
        startTime = System.nanoTime();
        String item = al.get(randomInt);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Your random item is " + item + " at " + randomInt);
        System.out.println("It took " + duration + " nanoseconds to retrieve " + item);
        
        */
        //Testing input and output of each list (Linked List)
        System.out.print("\nEnter the amount of teams: ");
        int numOfTeams = console.nextInt();
        LinkedList shuffledLists = new LinkedList();
       
        for (int i = 0; i < numOfTeams; i++) {
            Collections.shuffle(ll);
            shuffledLists.add(ll);
            //System.out.println(shuffledLists);
            System.out.print("Enter a number to get an item from the list: ");
            int choice = console.nextInt();
            startTime = System.nanoTime();
            String item = ll.get(choice);
            endTime = System.nanoTime();
            duration = (endTime - startTime);
            System.out.println("Your item is " + item);
            System.out.println("It took " + duration + " nanoseconds to retrieve " + item);
            System.out.print("Enter a string to add an item from the list: ");
            item = console.next();
            startTime = System.nanoTime();
            ll.set(choice, item);
            endTime = System.nanoTime();
            duration = (endTime - startTime);
            //System.out.println("Your item is " + item);
            System.out.println("It took " + duration + " nanoseconds to add " + item + "\n");
            //System.out.println(ll);
            
        }
        Random rand = new Random();
        int randomInt = rand.nextInt(100);
        startTime = System.nanoTime();
        String item = ll.get(randomInt);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Your random item is " + item + " at " + randomInt);
        System.out.println("It took " + duration + " nanoseconds to retrieve " + item);
        
	}
}