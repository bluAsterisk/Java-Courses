
public class InputParms {
	public static void main(String argv[])throws java.io.IOException,Exception
	  {
	    //String[] names = {"Kevin", "Jack" , "Jude"};
	    for(int i = 0; i < argv.length; i++)
	        {
	          if(argv[i].equals("Kevin"))
	            System.out.println("The name " + argv[i] + " was found");
	        }
	  }

}
