package Problem_01;
import java.util.Scanner;

public class Dealer {
	public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.println("Supra");
        System.out.println("P1");
        System.out.print("What car would you like to view? (s /p1)");
        String choice = in.next();
        if (choice.contains("s")){
            Toyota supra = new Toyota("Supra MkIV", 1998, 950);
            supra.description();
            supra.setPrice();
        }
        else if (choice.contains("p1")){
            System.out.println();
            McLaren p1 = new McLaren("P1", 2017, 1200);
            p1.description();
            p1.setPrice();
        }
        else{
            System.out.println("You've made an invalid input.");
        }
	}
}
