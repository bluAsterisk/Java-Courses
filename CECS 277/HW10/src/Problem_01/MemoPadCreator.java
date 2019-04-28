package Problem_01;
import java.util.Scanner;
import java.util.Date;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MemoPadCreator {
	public static void main(String[] args) throws FileNotFoundException
	{
		Date now;
		Scanner console = new Scanner(System.in);
		System.out.print("Output file: ");
		String filename = console.nextLine();
		PrintWriter out = new PrintWriter(filename);
		String dateStamp;
		boolean done = false;
		while(!done)
		{
			System.out.println("Memo topic (enter -1 to end):");
			String topic = console.nextLine();
			if (topic.equals("-1"))
				done = true;
			else
			{
				System.out.println("Memo text:");
				String message = console.nextLine();
				// Create the new date object and obtain a dateStamp
				Date d1 = new Date();
				dateStamp = d1.toString();
				out.println(topic + "\n" + dateStamp + "\n" + message);
			}
		}
		// Close the output file
		out.flush();
		out.close();
	}
}
