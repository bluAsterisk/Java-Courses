// Problem 2: Create an interface named Turning,
// with a single method named turn(). Create a class
// named Leaf that implements turn() to print 
// "Changing colors". Create a class named Page that 
// implements turn() to print "Going to the next page". 
// Create a class named Pancake that implements turn() 
// to print "Flipping". Write a program Turners that creates
// one object of each of these class types and demonstrates
// the turn() method for each class. Then think of two more
// objects that use turn(), create classes for them, 
// and then add objects to the Turners program.

package Problem_02;

public class TestTurning {
	public static void main(String argv[]) {
		Leaf L = new Leaf();
		Page B = new Page();
		Pancake P = new Pancake();
		
		L.turn();
		B.turn();
		P.turn();
	}
}
