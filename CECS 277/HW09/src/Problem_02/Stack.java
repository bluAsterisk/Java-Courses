package Problem_02;

import java.util.ArrayList; 
public class Stack<T extends Object>
{    
	private ArrayList<T> myList;    
	public Stack(){myList = new ArrayList<T>();}
	public void push(T item){myList.add(item);}
	public T pop()
	{
		T retItem = null;       
		if (!myList.isEmpty())       
			retItem = myList.remove(myList.size() - 1);
		return retItem;    
		}
	public boolean  empty(){return myList.isEmpty();}
}