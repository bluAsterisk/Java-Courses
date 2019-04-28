package Part_01;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class ReadMap {
	public static void main(String[] args) throws IOException
	{
		Scanner console = new Scanner(System.in);
		TreeMap tm = new TreeMap();
		HashMap hm = new HashMap();
		File inFile = new File("QnotfollowedbyU.txt");
		BufferedReader br = new BufferedReader(new FileReader(inFile));
		Scanner in = new Scanner(inFile);
		int key = 0;
		// Time TreeMap
		long startTime = System.nanoTime();
		String line = "";
		key = 0;
		startTime = System.nanoTime();
		while ((line = br.readLine()) != null) {
            tm.put(key, line);
            key++;
		}		long endTime = System.nanoTime();
		long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
		System.out.println(tm);
		System.out.println("Reading file into TreeMap took: " + duration  +" nanoseconds");
		br.close(); // Close the file
		// Reopen to read from top again
		br = new BufferedReader(new FileReader(inFile));
		// HashMap
		key = 0;
		startTime = System.nanoTime();
		while ((line = br.readLine()) != null) {
            hm.put(key, line);
            key++;
		}
		endTime = System.nanoTime();
		duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
		System.out.println(hm);
		System.out.println("Reading file into HashMap took: " + duration + " nanoseconds");
		br.close();
		
		// The Scrabble Part
		// Match letters of each word from the scrabble chart and total the points
	    // Test search time for both TreeMap and HashMap to compare efficiency
		/*TreeMap<String, String> tm2 = new TreeMap<>();

	    	File inFile2 = new File("ScrabblePointValues.txt");
	    BufferedReader br2 = new BufferedReader(new FileReader(inFile2));
	    line = "";
	    key = 0;
	    do {
	        tm2.put(br2.readLine(), br2.readLine());
	        System.out.println(tm2);
	        }while ((line = br2.readLine()) != null);
	    br2.close();*/
		
		// Reading Scrabble file
        File inFile2 = new File("ScrabblePointValues.txt");
        HashMap<String, String> hm2 = new HashMap<>();
        line = "";
        br = new BufferedReader(new FileReader(inFile2));
        startTime = System.nanoTime();
        while ((line = br.readLine()) != null){
            String[] parts = line.split(" ", 2);
            if (parts.length >= 2){
              
              	// initialized a new "key" variable because "key" was already used
                String key2 = parts[0];
                String value = parts[1];
                hm2.put(key2, value);
                System.out.println(value);
            }
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("Reading file into HashMap took: " + duration + " nanoseconds");
        br.close();
	}
}
