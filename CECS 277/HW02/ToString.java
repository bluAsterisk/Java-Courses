
public class ToString {
	public static void main(String argv[])
	{
		int someInt = 21;
		double someDouble = 128.04;
		Integer.toString(someInt);
		System.out.println(someInt);
		Double.toString(someDouble);
		System.out.println(someDouble);
		String someString = Integer.toString(20);
		System.out.println(someString);
		someString += 20;
		System.out.println(someString);
	}
}