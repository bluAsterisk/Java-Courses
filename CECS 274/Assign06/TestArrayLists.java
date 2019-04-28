// CECS 274
// TestArrayLists.java
// Kevin Phan
// 015260958

class TestArrayLists
{
  public static void main(String argv[]) throws Exception
  {
    ArrayLists X = new ArrayLists();;
    try
	{
    X.Store(0, 3.5);
    X.Store(1, 2.2);
    X.Store(0, 4.1);
      }
    // Make sure Store (and Print) still work
      catch(Exception e)
	  {
	      System.out.println("Out of bounds...");
	  }
    X.Print();
  
    // Test one, the student's MaxSize
    System.out.println(X.MaxSize());
  
    // Test the find
    System.out.println(X.Find(2.2));
  
    // This returns a -1 because it "fails"
    System.out.println(X.Find(7.5));
  
    // Test the delete
    X.Delete(1);
    X.Print();
  
    // Test the Delete's throw
    try
    {
      X.Delete(4);
      System.out.println("throw test FAILED\n");
    }
    catch(Exception e)
    {
      System.out.println("throw test PASSED\n");
    };
    // Make sure the stop condition on the delete loop is correct.
    // Fill up the array. It started with 3, we deleted 1 leaving 2,
    // so we add 5 to completely fill it.
    try{
    X.Store(0, 5.4);
    X.Store(0, 4.4);
    X.Store(0, 3.4);
    X.Store(0, 2.4);
    X.Store(0, 1.4);
    // Now test the delete on a full array.
    X.Delete(2);
    }
    catch(Exception e)
	{
	    System.out.println("Out of bounds...");
	}
    X.Print();
  }
}
