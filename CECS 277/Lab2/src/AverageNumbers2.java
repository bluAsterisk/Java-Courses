
public class AverageNumbers2 
{
	public static void main(String argv[])
	  {
	    int counter = 1;
	    double total = 0;
	    for(int i = 1; i <= 50; i++)
	      total += i;
	    System.out.println("Average from 1 ~ 50 is " + (total/50));
	    total = 0;
	    while(counter <= 50)
	    {
	      total += counter;
	      counter++;
	    }
	   System.out.println("Average from 1 ~ 50 is " + (total/50));
	  }
}
