// Assignment 14
// Queue.java
// CECS 274
// Kevin Phan
// 015260958

class Queue
{

  public static class EmptyException extends Exception
  {
    private static final long serialVersionUID=0;
  };

  public Queue()
  {
    // Set up the dummy node.
    Head = new node();
    Head.Next = Head;
    Head.Previous = Head;
  };

  // Put an item onto the stack
  public void Store(StudentRecord Item)
  {
    // Store on the top of the stack, that is
    // insert it at the front of the doubly linked list.
    node afterMe = Head.Previous; //insert at the back of the line
    node newNode = new node();
    newNode.Item = new StudentRecord(Item);
    newNode.Previous = afterMe;
    newNode.Next = afterMe.Next;
    newNode.Previous.Next = newNode;
    newNode.Next.Previous = newNode;
  };
  
  // Retreive a copy of the top item on the stack
  // Throws EmptyException if the stack is empty
  public StudentRecord Retrieve() throws EmptyException
  {
      StudentRecord itemValue;
      if(Head == Head.Next)
	  throw new EmptyException();
      else
	  {
	      itemValue = new StudentRecord(Head.Next.Item);
	  }
      return itemValue;
  };
  
  // Delete the item on the top of stack
  // Throws EmptyException if the stack is empty
  public void Delete() throws EmptyException
  {
      if(Head == Head.Next)
	  throw new EmptyException();
      else
	  {
	      node DeleteMe = new node();
	      DeleteMe = Head.Next;
	      DeleteMe.Next.Previous = DeleteMe.Previous; 
	      DeleteMe.Previous.Next = DeleteMe.Next;
	  }
  };

  // Return true if empty
  // return false if not empty
  public boolean Empty()
  {
      if(Head.Next == Head.Previous)
	  return true;
      else
	  return false;
  };

  // Print the contents of the stack.
  public void SummarizeForward()
  {
    // go to the first node in the list
    node Cur = Head.Next;
    // Cycle until we come back to the dummy node
    while (Cur != Head)
    {
      System.out.print(Cur.Item + " " );
      Cur = Cur.Next;
    };
    System.out.println("");
  };

  public void SummarizeBackward()
  {
    // go to the dummy node
    node Cur = Head;
    // go to the last node in the list
    Cur = Head.Previous;
    // Cycle until we come back to the dummy node
    while (Cur != Head)
    {
      System.out.print(Cur.Item + " " );
      Cur = Cur.Previous;
    };
    System.out.println("");
  };

  // The node record
  // Can't be static if we are going to genericize it.
  private class node
  {
    StudentRecord Item;
    node Next;
    node Previous;
  };

  // The head of the doubly linked list,
  //  for the stack this points to the
  //  dummy node.
  private node Head;
};
