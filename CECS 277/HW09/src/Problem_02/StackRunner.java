package Problem_02;
import java.util.Stack;
public class StackRunner {    
	public static void main(String[] args)    
	{          
		Stack<Character> stk1 = new Stack<Character>();
		stk1.push('v');       
		stk1.push('r');      
		stk1.push('t');       
		stk1.push('e');       
		while (!stk1.empty())       
			System.out.println(stk1.pop());
		}   
}