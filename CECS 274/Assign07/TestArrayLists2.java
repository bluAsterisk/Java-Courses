// TestArrayLists2.java
// CECS 274
// Kevin Phan
// 015260958

class TestArrayLists2
{
  public static void main(String[] argv) throws Error
  {
    ArrayLists X = new ArrayLists(7);
    // Initial tests, make sure the old operators still work
    try{
    X.Store(0,3.5);
    X.Store(1,2.2);
    X.Store(0,4.1);
    }
    catch(Exception e)
	{
	    System.out.println("Out of bounds...");
	};
    // Make sure Store (and Print) still work
    X.Print();
  
    // Test one, the student's MaxSize
    System.out.println( X.MaxSize());
  
    // Test the find
    System.out.println( X.Find(2.2));
  
    try {
      System.out.println( X.Find(7.5));
    }
    catch (Exception e)
    {
      System.out.println( "Threw because it wasn't in the array");
    };
  
    // Test the delete
    try{
    X.Delete(1);
    }
    catch(Exception e)
	{
	    System.out.println("Array is empty");
	};
    X.Print();
  
    // Test the Delete's throw
    try
    {
      X.Delete(4);
      System.out.println( "throw test FAILED");
    }
    catch(Exception e)
    {
      System.out.println( "throw test PASSED");
    };
    // New tests, test the copy.
    // Test the CopyOf method
    ArrayLists Y = new ArrayLists();
    try{
    Y.CopyOf(X);
    // X should change, but y should not.
    X.Store(0,9.99);
    //  Should be 9.99
    System.out.println( X.Retrieve(0));
    // Should be 4.1
    System.out.println( Y.Retrieve(0));
    // Should be 2.2
    System.out.println( Y.Retrieve(1));
    }
    catch(Exception e)
	{
	    System.out.println("CopyOf FAILED");
	};
    // Test the copy constructor.
    ArrayLists Z = new ArrayLists(X);
    //  Should be 9.99
    try{
    System.out.println(Z.Retrieve(0));
    }
    catch(Exception e)
	{
	    System.out.println("Not found...");
	}
  
  };
};
