package Problem_02;
import java.util.Scanner;
public class Pharmacy {
	public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Cold medicine");
        System.out.println("Hydrochlorothiazide");
        System.out.print("What medicine would you like to view? (cm / h)");
        String choice = in.next();

        if (choice.contains("cm")) {
            ColdMedicine cm = new ColdMedicine("cold medicine", "alleviate cold", 3);
            cm.description();
            cm.getPrice();
        }

        else if (choice.contains("h")) {
            Hydrochlorothiazide h = new Hydrochlorothiazide("Hydrochlorothiazide", "reduce blood pressure", 2);
            h.description();
            h.getPrice();
        }
        else{
            System.out.println("You've made an invalid input.");
        }
    }
}
