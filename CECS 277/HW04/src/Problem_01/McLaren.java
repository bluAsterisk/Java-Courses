package Problem_01;

public class McLaren extends Auto{
	public McLaren(String model, int year, int hp) {
        super(model, year, hp);
    }

    public void setPrice(){
        System.out.println("The price of this McLaren is $150,000");
    }
}
