package com.Homework82;

public class CarPhone extends CarRental{
// copy constructor to parent class
	public CarPhone(CarRental A)
	{
		rate = A.getRate();
		price = A.getPrice();
	    days = A.getDays();
	};
// method to adjust rate for phone
	public void addPhone(int phoneCost){
		this.rate += phoneCost;
	    super.computePrice();
	};
}
