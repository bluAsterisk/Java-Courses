package com.Homework81;
public class Square
{
	public Square()
	{};
	public Square(double h, double w)
	{
		height = h;
		width = w;
	};
	public double computeSurfaceArea()
	{
		surfaceArea = height * width;
		return surfaceArea;
	};
  protected double height;
  protected double width;
  protected double surfaceArea;
}

