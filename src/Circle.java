package org.gitam.cseblr;

public class Circle implements IShape {
	double mRadius;
	public static double  PI = 22.0/7.0;
	
	public Circle(double radius)
	{
		mRadius = radius;
	}
	
	@Override
	public double area()
	{
		return PI * mRadius * mRadius;
	}
	
	@Override
	public double circumference()
	{
		return 2 * PI * mRadius ;
	}
}
