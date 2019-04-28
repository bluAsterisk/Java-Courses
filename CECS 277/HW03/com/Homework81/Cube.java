package com.Homework81;

public class Cube extends Square
{
	public Cube(double h, double w, double d)
	{
		height = h;
		width = w;
		depth = d;
	};
	public double computeSurfaceArea()
	{
		surfaceArea = height * width * depth; // this is volume
		surfaceArea = height * width * 6; // this is surface area
	    return surfaceArea;
	};
	  private double depth;
}
