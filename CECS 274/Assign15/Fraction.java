class Fraction
{
	public Fraction(int top, int bottom)
	{
		numerator = top;
		denominator = bottom;
	}
	
	public static Fraction Multiply(Fraction L, Fraction R)
	{
		Fraction Answer = new Fraction( L.numerator * R.numerator,
			L.denominator * R.denominator );
		return Answer;
	}

	public static Fraction Divide (Fraction L, Fraction R)
	{
		Fraction Answer = new Fraction( L.Numerator() * R.Denominator(),
			L.Denominator() * R.Numerator() );
		return Answer;
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
	public String toString()
	{
		return ("" + numerator + " / " + denominator);
	}

	private int numerator;
	private int denominator;
}
