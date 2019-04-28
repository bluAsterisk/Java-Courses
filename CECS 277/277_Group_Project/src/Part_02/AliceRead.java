
package Part_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class AliceRead {
    public static void main(String[] args) throws IOException{

         // Reading into TreeMap
        String fileName = "alice30.txt";
        TreeMap tm = new TreeMap();
        File inFile = new File(fileName);
        Scanner sc = new Scanner(inFile);
        int count = 0;
        String line = "";
        long startTime = System.nanoTime();
        while (sc.hasNextLine()) {
            Scanner sc2 = new Scanner(sc.nextLine());
            while (sc2.hasNextLine()) {
                String s = sc2.next();
                s = s.replaceAll("[^a-zA-Z0-9]", "");
                tm.put(count, s);
                count++;
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;  //divide by 1000000 to get milliseconds.
        System.out.println("Reading file into TreeMap took: " + duration  +" milliseconds");
        
        // Reading into HashMap
        HashMap hm = new HashMap();
        // HashMap
        count = 0;
        line = "";
        sc = new Scanner(inFile);
        startTime = System.nanoTime();
        while (sc.hasNextLine()) {
            Scanner sc2 = new Scanner(sc.nextLine());
            while (sc2.hasNextLine()) {
                String s = sc2.next();
                s = s.replaceAll("[^a-zA-Z0-9]", "");
                hm.put(count, s);
                count++;
            }
        }
        //System.out.println(hm);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;  //divide by 1000000 to get milliseconds.
        System.out.println("Reading file into HashMap took: " + duration + " milliseconds");
       
        //System.out.println(hm);
        /*
        // TESTING TREE MAP WITH USER INPUT
        count = 0;
        int total = 0;
        Scanner in = new Scanner(System.in);
        
        // user inputs string to find occurrences in file. This applies to both tree map and hash map
        System.out.print("Please enter a word to search: ");
        String word = in.nextLine();

        
        for(int i = 0; i < 100; i++) {
        		startTime = System.nanoTime();
        		if(tm.containsValue(word))
        			count++;
        		endTime = System.nanoTime();
        		duration = (endTime - startTime);
        		total += duration;
        }
        total /= 100;
        if(count > 0)
        		System.out.println("Found");
        else
        		System.out.println("Not found");
        System.out.println("Searching the TreeMap took: " + total + " nanoseconds on average");
        //System.out.println(word + " appears " + count + " times.");
        */
        
        // TESTING HASH MAP WITH USER INPUT
        count = 0;
        int total = 0;
        Scanner in = new Scanner(System.in);
        
        // user inputs string to find occurrences in file. This applies to both tree map and hash map
        System.out.print("Please enter a word to search: ");
        String word = in.nextLine();

        
        for(int i = 0; i < 100; i++) {
        		startTime = System.nanoTime();
        		if(tm.containsValue(word))
        			count++;
        		endTime = System.nanoTime();
        		duration = (endTime - startTime);
        		total += duration;
        }
        total /= 100;
        if(count > 0)
        		System.out.println("Found");
        System.out.println("Searching the HashMap took: " + total + " nanoseconds on average");
    }
    
}