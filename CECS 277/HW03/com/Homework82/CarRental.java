package com.Homework82;

public class CarRental {
    protected double rate;
	protected double price;
	protected int days;
	String size;
	public CarRental() {};
	public CarRental(char size, int rentDays)
	{
	    days = rentDays;
	    switch(size)
	    {
	    	case 'e':
	    		rate = 20;
	            break;
	        case 'm':
	            rate = 30;
	            break;
	        case 'f':
	            rate = 40;
	            break;
	    }
	    price = rate * days;
	};
			
	public void setRate(double rateVal){
		rate = rateVal;
	};
	    
	public double getRate(){
		return rate;
	};

	public double getPrice(){
	    return price;
	};

	public void computePrice(){
	    price = rate * days;
	};
	    
	public void setDays(int dayVal){
	    days = dayVal;
	};
	    
	public int getDays(){
	    return days;
	};
	    
	public void totalPrice(){
	    System.out.println("Your total price is " + price);
	};
}
