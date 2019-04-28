package Problem_01;

public class Toyota extends Auto{
	public Toyota(String model, int year, int hp) {
        super(model, year, hp);
    }
    public void setPrice(){
        System.out.println("The price of this Toyota is $20,000");
    }
}
