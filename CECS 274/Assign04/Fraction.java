// Fraction.java
// CECS 274
// Kevin Phan
// 015260958

class Fraction
{
	public Fraction(int top, int bottom)
	{
		numerator = top;
		denominator = bottom;
	}
	
	public static Fraction Multiply(Fraction L, Fraction R) throws DivideByZero{
	    if((L.Denominator() == 0)||(R.Denominator() == 0))
		throw new DivideByZero();
	    {
		Fraction Answer = new Fraction( L.Numerator() * R.Numerator(),
						L.Denominator() * R.Denominator() );
		return Answer;
	    }
	}
	public static Fraction Divide (Fraction L, Fraction R) throws DivideByZero{
	    if((L.Denominator() == 0)||(R.Denominator() == 0))
		   throw new DivideByZero();
	       {
		   Fraction Answer = new Fraction( L.Numerator() * R.Denominator(),
						   L.Denominator() * R.Numerator() );
		   return Answer;
	       }
	}
	public int Numerator()
	{
		return numerator;
	}

	public int Denominator()
	{
		return denominator;
	}

	public String ToString()
	{
		return ("" + numerator + " / " + denominator);
	}

	private int numerator;
	private int denominator;
}
