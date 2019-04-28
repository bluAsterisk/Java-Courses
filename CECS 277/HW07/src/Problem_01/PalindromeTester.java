package Problem_01;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeTester {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		PalindromeTester p = new PalindromeTester();
		String choice = in.next();
		if(p.isPalindrome(choice))
			System.out.println("String was a palindome");
		else
			System.out.println("String wasn't a palindome");
	}

    boolean isPalindrome(String str){
        LinkedList<String> link1 = new LinkedList<String>();
        for (String a : str.split("(?<!^)")){
            link1.add(a);
        }
        System.out.println(link1);
        Iterator<String> iter = link1.listIterator();
        Stack<String> stack = new Stack<>();

        while (iter.hasNext()){
            stack.push(iter.next());
        }
        LinkedList<String> link2 = new LinkedList<String>();
        while (!stack.empty()){
            link2.add(stack.pop());
        }
        System.out.println(link2);
        if (link1.equals(link2)){
            return true;
        }else{
            return false;
        }
    }
}

