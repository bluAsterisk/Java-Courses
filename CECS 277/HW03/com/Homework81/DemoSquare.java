package com.Homework81;
public class DemoSquare 
{
	public static void main(String argv[])
	{
		Square sqr1 = new Square(2.0,2.0);
		Cube cb1 = new Cube(3,3,3);
		System.out.println("The surface area of sqr1 is " + sqr1.computeSurfaceArea());
		System.out.println("The surface area of cb1 is " + cb1.computeSurfaceArea());
	}
}
