// Assignment 11
// LinkedList.java
// CECS 274
// Kevin Phan
// 015260958

class LinkedList
{
  // public because something returns it.
  public static class node
  {
    public int Item;
    public node Next;
  }

  // Create an empty linked list
  public LinkedList()
  {
    Head = null;
  };


    //Delete Node
    public void DeleteFront()
    {
	// check if list is empty
	if(Head == null)
	    {}
	else
	    Head = Head.Next;
    }

    //Insert at tail
    public void InsertAtBack(int value)
    {
	if(Head == null)
	    {
		node newNode = new node();
		newNode.Next = Head;
		newNode.Item = value;
		Head = newNode;
	    }
	else
	    {
		node Cur;
		node newNode = new node();
		newNode.Item = value;
		for(Cur = Head; Cur != null; Cur = Cur.Next)
		    {
			if(Cur.Next == null)
			    {
				Cur.Next = newNode;
				newNode.Next = null;
			    }
		    }
	    }
    }
    
    // Count nodes
    public int Count()
    {
	int total = 0;
	node Cur;
	for(Cur = Head; Cur != null; Cur = Cur.Next)
	    {
		total++;
	    }
	return total;
    }

    // Record largest in in list
    public int GetLargest()
    {
	int largest = 0;
	node Cur;
	for(Cur = Head; Cur != null; Cur = Cur.Next)
	    {
		if(Cur.Item > largest)
		    {
			largest = Cur.Item;
		    }
	    }
	return largest;
    }
    
  // Insert at front
  public void Insert(int Item)
  {
    node newNode = new node();
    newNode.Item = Item;
    newNode.Next = Head;
    Head = newNode;
  };

  // Delete the specified item. If the item is not
  // found, do nothing.
  public void Delete(int Item)
  {
    if (Head == null) return;
    if (Head.Item == Item)
    {
      Head = Head.Next;
    }
    else
    {
      node Cur = Head;
      while (Cur.Next != null)
      {
        if (Cur.Next.Item == Item)
        {
          Cur.Next = Cur.Next.Next;
          return;
        }
        Cur = Cur.Next;
      }
    }
  };
  
  // find and return the node that contains to the item.
  // If the item isn't in the list, return null.
  public node Retrieve(int Item)
  {
    node Cur = Head;
    while (Cur != null)
    {
      if (Cur.Item == Item) return Cur;
      Cur = Cur.Next;
    };
    return null;
  };
  
  // Retrieve the node at the front of the list.
  // If the list is empty, return null.
  public node Retrieve()
  {
    return Head;
  };

  // Print the contents of the linked list
  public void Print()
  {
    node Cur = Head;
    while (Cur != null)
    {
      System.out.println(Cur.Item);
      Cur = Cur.Next;
    }
  };

  // In case we decide to do an extension of the linked list,
  // we make this protected instead of private
  protected node Head;
};