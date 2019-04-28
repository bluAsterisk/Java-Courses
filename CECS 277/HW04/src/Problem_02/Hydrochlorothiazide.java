package Problem_02;

public class Hydrochlorothiazide extends Drug {
	public Hydrochlorothiazide(String name, String purpose, int timePerDay) {
        super(name, purpose, timePerDay);
    }

    @Override
    void getPrice() {
        System.out.println("The price of Hydrochlorothiazide is $10.00 per package");
    }
}
