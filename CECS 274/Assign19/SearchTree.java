// Assignment 19
// SearchTree.java
// Kevin Phan
// 015260958

class SearchTree
{
    public class NotFound extends Exception
    {
	private static final long serialVersionUID = 0;
    };

  // Initialize an empty tree
  public SearchTree()
  {
    Root = null;
  };


  public void Update(int Key, double Data) throws NotFound
  {
      Update(Root, Key, Data);
  };

  public int Size()
  {
      return Size(Root);
  };

  public int Height()
  {
      return Height(Root);
  };

  // Report the contents of the tree
  public void Report()
  {
    Report(Root);
  };

  // Locate an element with the given key and return the
  //  associated data.
  public double Find(int Key) throws Error
  {
    return Find(Root, Key);
  };

  // Insert a new element into the tree.
  public void Insert(int Key, double Data) throws Error
  {
    Root = Insert(Root, Key, Data);
  };

  // Find and delete a key.
  public void Delete(int Key) throws Error
  {
    Root = Delete(Root, Key);
  };

  private class Tree_Node
  {
    int Key;
    double Data;
    Tree_Node Left, Right;
  };
  private Tree_Node Root;

  private void Update(Tree_Node T, int key, double data) throws NotFound
  {
      if(T == null)
	  throw new NotFound();
      else if(T.Key == key)
	  T.Data = data;
      else if(key < T.Key)
	      Update(T.Left, key, data);
      else
	      Update(T.Right, key, data);
  };

  private int Size(Tree_Node T)
  {
      if(T == null)
	     return 0;
      else
	     return Size(T.Left) + 1 + Size(T.Right);
  };

  private int Height(Tree_Node T)
  {
      if(T == null)
	     return 0;
      else
	     return Math.max(Height(T.Left), Height(T.Right)) + 1;
  };
  private void Report(Tree_Node T)
  {
  // Print the contents of a tree from
  //  smallest to largest by doing an InOrder
  //  traversal
    if (T != null)
    {
      Report(T.Left);
      System.out.println(T.Data);
      Report(T.Right);
     }
  };

  private double Find(Tree_Node T, int Key) throws Error
  {
    if (T == null)
      throw new Error();
    if (T.Key == Key)
      return T.Data;
    else if (Key < T.Key)
      return Find(T.Left, Key);
    else
      return Find(T.Right, Key);
  };

  // A tree node (Save) is passed back.
  // Save.Data and Save.Key will be needed by the original caller.
  // All nodes will use Save.Right to adjust their appropriate child
  // pointer. Save.Left is unused.
  private Tree_Node Get_And_Remove_Smallest(Tree_Node T)
  {
    Tree_Node Save;
    if (T.Left == null)
    {
      Save = T;
      // Who ever pointed to this node,
      // should now point to what ever T.Right pointed to.
      return Save;
    }
    else
    {
      Save = Get_And_Remove_Smallest(T.Left);
      // Make any needed adjustment to our left pointer
      T.Left = Save.Right;
      // Whoever pointed to this node,
      // should still point to this node.
      Save.Right = T;
      return Save;
    }
  };

  private Tree_Node Insert(Tree_Node T, int Key,
                  double Data ) throws Error
  {
    if (T == null)
    {
      Tree_Node newNode = new Tree_Node();
      newNode.Key = Key;
      newNode.Data = Data;
      newNode.Left = null;
      newNode.Right = null;
      // Inserted a node, return the value of the new node
      return newNode;
    }
    else if (Key == T.Key)
      throw new Error(); // Duplicate_Key
    else if (Key < T.Key)
      T.Left = Insert(T.Left, Key, Data);
    else
      T.Right = Insert(T.Right, Key, Data);
    // No change, return the old value
    return T;
  };

  private Tree_Node Delete(Tree_Node T, int Key) throws Error
  {
    Tree_Node Save;
    if (T == null)
      throw new Error(); // Key Not Found
    if (Key < T.Key)
      T.Left = Delete(T.Left, Key);
    else if (T.Key < Key)
      T.Right = Delete(T.Right, Key);
    else
    {
      if ((T.Left == null) && (T.Right == null))
        T = null;
       else if (T.Right == null)
         T = T.Left;
      else if (T.Left == null)
        T = T.Right;
      else
      {
        // Move the smallest of the right subtree
	// to the current location.
        Save = Get_And_Remove_Smallest(T.Right);
        T.Data = Save.Data;
        T.Key = Save.Key;
	// Also perform any needed adjustment to our left pointer
        T.Right = Save.Right;
      }
    }
    // It's either the old value of the new value
    return T;
  };

};
