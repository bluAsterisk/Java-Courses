package com.Homework82;
import java.util.Scanner;
public class DemoCarRental {
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello there!\n");
        System.out.println("Here is a menu of car rentals and their prices: ");
        System.out.println("Economy: $20");
        System.out.println("Medium: $30");
        System.out.println("Full-Size: $40");
        System.out.print("What would you like to choose? (e / m / s): ");
        char choice1 = input.next().charAt(0);
        System.out.print("How many days would you like to rent for? ");
        int days = input.nextInt();
        CarRental cr = new CarRental(choice1, days);
        System.out.print("Excellent choice! Would you like to have" +
                " a built in phone with that? (y / n): ");
        char choice2 = input.next().charAt(0);
        if (choice2 == 'y'){
			CarPhone cp = new CarPhone(cr);
            cp.addPhone(10);
            cp.totalPrice();
        }
        else
        	cr.totalPrice();
    }
}
