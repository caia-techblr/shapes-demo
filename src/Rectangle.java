package org.gitam.cseblr;

public class Rectangle extends Polygon {
	int mLength;
	int mBreadth;
	Rectangle(int len,int br)
	{
		mLength = len;
		mBreadth = br;
	}
	public double area()
	{
		return mLength * mBreadth;
	}
	public double circumference()
	{
		return 2 * (mLength + mBreadth);
	}
}
