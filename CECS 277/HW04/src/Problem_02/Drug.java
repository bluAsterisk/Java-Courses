package Problem_02;

public abstract class Drug {
	    String name, purpose;
	    int timePerDay;
	    abstract void getPrice(); // ABSTRACT CLASS

	    public Drug(String name, String purpose, int timePerDay) {
	        this.name = name;
	        this.purpose = purpose;
	        this.timePerDay = timePerDay;
	    }
	    public void description(){

	        System.out.println("The name of this drug is " + name);
	        System.out.println("The purpose of this drug is to " + purpose);
	        System.out.println("You should take this " + timePerDay + " times per day");
	    }
}
