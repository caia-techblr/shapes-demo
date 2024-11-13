package org.gitam.cseblr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void testArea() {
		Circle c1 = new Circle(7.0);
		assertEquals(c1.area(),154.0,"area calculation is wrong");
	}
	
	@Test
	void testCircumference() {
		Circle c1 = new Circle(7.0);
		assertEquals(c1.circumference(),44.0,"circumference calculation is wrong");
	}
	
	@Test
	void testPolyArea() {
		IShape c1 = new Circle(7.0);
		assertEquals(c1.area(),154.0,"area calculation is wrong");
	}
	
	@Test
	void testPolyCircumference() {
		IShape c1 = new Circle(7.0);
		assertEquals(c1.circumference(),44.0,"circumference calculation is wrong");
	}

}
