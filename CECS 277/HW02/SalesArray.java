
public class SalesArray 
{
	public static void main(String argv[])
	{
		int[][] sales = new int[][]{{750, 660, 910, 800},
				{800, 700, 950, 900},
				{700, 600, 750, 600},
				{850, 800, 1000, 950},
				{900, 800, 960, 980}};
		int total = 0;
		// Department totals
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 4; j++)
				total += sales[i][j];
			System.out.println("Dept. " + (i + 1) + " total is " + total);
			total = 0;
		}

		// Quarter totals
		for(int j = 0; j < 4; j++)
		{
			for(int i = 0; i < 5; i++)
				total += sales[i][j];
			System.out.println("Quarter " + (j + 1) + " total is " + total);
			total = 0;
		}
	}
}
