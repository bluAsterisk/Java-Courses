// Assignment 17
// Recursion.java
// Kevin Phan
// 015260958
import java.util.Scanner;

class Recursion
{
    public static void main(String arvg[]) throws java.io.IOException
    {
	int n = 1;
	Scanner reader = new Scanner(System.in);
	do{
	    System.out.println("Enter a number");
	    //System.out.flush();
	    n = reader.nextInt();
	    PrintIt(n);
	}while (n > 0);
    }

    public static void PrintIt(int Value)
    {
	if(Value % 10 == Value)
	    System.out.println(Value % 10);
	else
	{
	    System.out.print(Value % 10);
	    PrintIt(Value / 10);
	}
    }
}
