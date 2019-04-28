package Problem_01;

public abstract class Auto {
	String model;
    int year;
    int hp;
	
    public Auto(String model, int year, int hp) {
        this.model = model;
        this.year = year;
        this.hp = hp;
    }
    abstract void setPrice();
    public void description(){

        System.out.println("The model of this car is a " + model);
        System.out.println("The year of this car is " + year);
        System.out.println("The horsepower of this car is " + hp);
    }
}
