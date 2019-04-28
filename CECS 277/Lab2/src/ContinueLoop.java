
public class ContinueLoop 
{
	public static void main(String argv[])
	  {
	    int count;
	    for(count = 1; count <= 10; count++)
	    {
	      if(count == 5)
	        {
	          continue;
	        }
	      System.out.println("count = " + count);
	    }
	    System.out.println("Used to continue to skip printing 5");
	  }
}
