// CECS 274
// ArrayLists.java (Assignment 9)
// Kevin Phan
// 015270958

// You need to fill in the bodies for MaxSize, Delete and Find

class ArrayLists
{
  public static class ListException extends Exception
  {
    private static final long serialVersionUID=0;
  };

  public ArrayLists()
  {
    // The array has a maximum size of 7
    maxSize = 7;
    List = new Fraction[7];
    // The array starts empty.
    size = 0;
  };

    public ArrayLists(int newSize)
    {
	// The array has a maximum size of the int passed
	maxSize = newSize;
	List = new Fraction[newSize];
	// The array starts empty.
	size = 0;
    };

    public ArrayLists(ArrayLists Y)
    {
	maxSize = Y.maxSize;
	size = Y.size;
	// Create new list
	List = new Fraction[maxSize];
	// Fill in new list
	for(int i = 0; i < size; i++)
	    {
		List[i] = Y.List[i];
	    }
    };
    
    // Deep copy method
    public void CopyOf(ArrayLists Y)
    {
	maxSize = Y.maxSize;
	size = Y.size;
	for(int i = 0; i < size; i++)
	    {
		List[i] = Y.List[i];
	    }
    };

  // Put an element into the list,
  // will throw it where is not between 0 and size
  public void Store(int where, Fraction Item) throws ListException
  {
    // Throw if out of bounds or full
    if (where>size || where<0 || size==maxSize) throw new ListException();
    // Open space (move rightmost first)
    for (int i = size; i > where ; i-- )
    {
	      List[i]=List[i-1];
    }
    // Drop the new item in
    List[where] = new IFraction(Item);
    // Increment the number of things in the list
    size++;
  };

  // Retrieve an element from the list
  // will throw it where is not between 0 and size-1
  public IFraction Retrieve(int where) throws ListException
  {
    // Throw if it is "out of bounds"
    if (where >= size || where < 0) throw new ListException();
    // return the requested item
    return new IFraction(List[where]);
  };

  // Delete an element from the list
  // will throw if where is not between 0 and size-1
  public void Delete(int where) throws ListException
  {
    // YOU FILL IN
      if((where < 0) || (where > size - 1)) throw new ListException();
      for(int i = where; i < size - 1; i++)
	  {
	      List[i] = List[i + 1];
	  }
      size--;
  }

  // Return number of things in the list 
  public int Size() 
  {
    return size;
  };

  // Return the maximum number of things that can be in the list
  public int MaxSize()
  {
    // YOU FILL IN
      return maxSize;
  };

  // Locate an item in the list, return "where" you
  //  found it. return -1 if it wasn't found.
  public int Find(Fraction Item)
  {
    // YOU FILL IN
      int location = 0;
      for(int i = 0; i < maxSize; i++)
	  {
	      if(List[i] == Item)
		  {
		      location = i;
		      return location;
		  }
    	  }
            return -1;
  };

  // Just here for testing, not for the final product.
  // Print what is in the list. The list is printed on a single line.
  public void Print()
  {
    for (int i=0 ; i< size ; i++)
    {
	System.out.print(List[i].ToString() + " ");
    }
    System.out.println("");
  };

  // You need to do MaxSize, Delete and Find here.

  private int maxSize;
  private int size;
  private Fraction[] List;
};

  
  
