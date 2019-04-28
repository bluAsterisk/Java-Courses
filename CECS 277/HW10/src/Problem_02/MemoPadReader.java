package Problem_02;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class MemoPadReader{
	public static void main(String[] args) throws IOException
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Input file: ");
		String inputFileName = console.nextLine();
		File inFile = new File(inputFileName);
		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
		Scanner in = new Scanner(inFile);
		boolean done = false;
		while (in.hasNextLine() && !done)
		{
			String topic = br.readLine();
			String dateStamp = br.readLine();
			String message = br.readLine();
			// You should only ask to display the next memo if 
			// there are more memos in the file
			if (topic != null) 
			{
				System.out.println("\n" + topic + "\n" + dateStamp + "\n" + message);
				System.out.print("\nDo you want to read the next memo? (y/n) ");
				String ans = console.nextLine();
				if (ans.equalsIgnoreCase("n"))
					done = true;
			}
			else
			{
				System.out.println("End of file");
				break;
			}
		}
		br.close();
	}
}
