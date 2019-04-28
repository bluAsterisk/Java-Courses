
public class BreakLoop 
{
	public static void main(String argv[])
	  {
	    int count;
	    for(count = 1; count <= 10; count++)
	    {
	      System.out.println(count);
	      if(count == 5)
	        break;
	    }
	    System.out.println("Broke out of the loop at count = " + count);
	  }
}
