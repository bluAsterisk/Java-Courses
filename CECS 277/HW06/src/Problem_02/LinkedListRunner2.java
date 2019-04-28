package Problem_02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListRunner2 {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList1 = new LinkedList<String>();
        myLinkedList1.add("aaa");
        myLinkedList1.add("bbb");
        myLinkedList1.add("ccc");
        myLinkedList1.add("ddd");
        myLinkedList1.add("eee");
        Iterator<String> iter1 = myLinkedList1.iterator();
        Stack<String> myStack = new Stack<String>();
        System.out.println("My Linked List 1: ");
        while (iter1.hasNext())
        		System.out.println(iter1.next());
        iter1 = myLinkedList1.iterator();
        while (iter1.hasNext())
            myStack.push(iter1.next());
        System.out.println("My Linked List 2: ");
        while(!myStack.empty())
        		System.out.println(myStack.pop());
    }
}
