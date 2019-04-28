// TestFraction2.java
// CECS274
// Kevin PHan
// 015260958

// Replace this line with you name, account and the number of this homework
// Tester for the second version of the fractions class
// Add the calls indicated in the comments below
class TestFraction2
{
  public static void main(String argv[]) throws java.io.IOException,
     DivideByZero
  {
    int numerator;
    int denominator;
    Fraction c;
    Fraction a = new Fraction(2,3);
    Fraction b = new Fraction(4,5);
    Fraction z = new Fraction(0,1);
    int x = 7;
    c = Fraction.Multiply(a,b);
    // Answer should be 8, 15
    System.out.println("answer is " + c.ToString());

    // Add a Multiply of a * x here
    c = Fraction.Multiply(a, x);
    // Answer should be 14, 3
    System.out.println("answer is " + c.ToString());


    // Add a Multiply of x * b here
    c = Fraction.Multiply(x, b);
    // Answer should be 28, 5
    System.out.println("answer is " + c.ToString());
  
    // Add a Reciprocal of b call here
    b =b.Reciprocal();
    // Answer should be 5, 4 (note we print b).
    System.out.println("answer is " + b.ToString());

    try
    {
      // Add a Reciprocal of z call here
      z = z.Reciprocal();
      System.out.println("throw test failed");
    }
    catch(DivideByZero e)
    {
      System.out.println("throw test worked");
    };
  }
}
