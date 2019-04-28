// Fraction.java (Assignment 9)
// CECS 274
// Kevin Phan
// 015260958

class IFraction extends Fraction
{   
    // one int for numerator
    public IFraction(int top)
    {
	super(top, 1);
    }

    // two ints for numerator and denominator
    public IFraction(int top, int bottom)
    {
	super(top,bottom);
    }

    // copy constructor
    public IFraction(Fraction Y)
    {
	super(Y.Numerator(), Y.Denominator());
    }

    public static IFraction Divide(int divisor, Fraction Y)
    {
	return new IFraction(Y.Denominator() * divisor,Y.Numerator());
    }

    public static IFraction Divide(Fraction Y, int divisor)
    {
	return new IFraction(Y.Numerator(), Y.Denominator() * divisor);
    }
};

class Fraction
{
    public Fraction(int top, int bottom)
	{
		numerator = top;
		denominator = bottom;
	}

    
    public static Fraction Multiply(Fraction L, Fraction R) throws DivideByZero
    {
	    if((L.Denominator() == 0)||(R.Denominator() == 0))
		throw new DivideByZero();
	    {
		Fraction Answer = new Fraction( L.Numerator() * R.Numerator(),
						L.Denominator() * R.Denominator() );
		return Answer;
	    }
    }

    public static Fraction Multiply(Fraction L, int intVal) throws DivideByZero
    {
	if(L.Denominator() == 0)
	    throw new DivideByZero();
	{
	    Fraction Answer = new Fraction(L.Numerator() * intVal, L.Denominator());
	    return Answer;
	}
    }

    public static Fraction Multiply(int intVal, Fraction L) throws DivideByZero
    {
	if(L.Denominator() == 0)
	    throw new DivideByZero();
	{
	    Fraction Answer = new Fraction(L.Numerator() * intVal, L.Denominator());
	    return Answer;
	}
    }
    public static Fraction Divide (Fraction L, Fraction R) throws DivideByZero
    {
	if((L.Denominator() == 0)||(R.Denominator() == 0))
	    throw new DivideByZero();
	{
	    Fraction Answer = new Fraction( L.Numerator() * R.Denominator(),
						   L.Denominator() * R.Numerator() );
	    return Answer;
	}
    }

    public Fraction Reciprocal() throws DivideByZero
    {
	Fraction temp = new Fraction(this.Denominator(), this.Numerator());
	if(temp.Denominator() == 0)
	    {
		throw new DivideByZero();
	    }
	else
	    return temp;
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
