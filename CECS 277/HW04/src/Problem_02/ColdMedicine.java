package Problem_02;

public class ColdMedicine extends Drug{
	public ColdMedicine(String name, String purpose, int timePerDay) {
        super(name, purpose, timePerDay);
    }

    @Override
    void getPrice() {
        System.out.println("The price of cold medicine is $5.00 per package");
    }
}
