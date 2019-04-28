// IFraction.java
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
