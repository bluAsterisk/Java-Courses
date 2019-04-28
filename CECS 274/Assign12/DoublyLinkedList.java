// Assignment 12
// CECS 274
// Kevin Phan
// 015260958

class DoublyLinkedList
{

  private class node
  {
    int Item;
    node Next;
    node Previous;
  };

  private node Head;

  public DoublyLinkedList()
  {
    // Set up the dummy node.
    Head = new node();
    Head.Next = Head;
    Head.Previous = Head;
  
  };
  
  // Add at the front
  public void Insert(int Item)
  {
    // Insert at the front of the doubly linked list.
    node afterMe = Head;
    node newNode = new node();
    newNode.Item = Item;
    // Set up the pointers in the new node
    // The new node points back to the dummy node
    newNode.Previous = afterMe;
    // The new node points forward to the former first node.
    newNode.Next = afterMe.Next;
    // This changes the dummy node to pointer to the new node.
    newNode.Previous.Next = newNode;
    // Change the former first node to indicate we are in front of it.
    newNode.Next.Previous = newNode;
  
  };
  
  // Add your methods HERE
    public int Count()
    {
	int total = 0;
	node cur = new node();
	cur = Head.Next;
	if(cur == Head)
	    return total;
	while(cur != Head)
	    {
		total++;
		cur = cur.Next;
	    }
	return total;
    }

    public int GetLargest()
    {
	node cur = new node();
	int largest = 0;
	cur = Head.Next;
	if(cur == Head)
	    return largest;
	while(cur != Head)
	    {
		if(cur.Item > largest)
		    largest = cur.Item;
		cur = cur.Next;
	    }
	return largest;
    }

};
