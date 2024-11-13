package org.gitam.cseblr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

enum ShapeType
{
	CIRCLE,
	RECTANGLE,
	TRIANGLE
}

class PolymorohicTest {
	
	IShape rc;
	IShape rt;
	IShape rect;
	//ShapeType type;
	
	@BeforeEach
	public void setUp() {
		rc = new Circle(7.0);
		rect = new Rectangle(10,20);
    }
	@AfterEach
	public void tearDown() {
		//TODO : Any cleanup code goes here
    }

	@Test
	void testCirlceArea() {
		assertEquals(rc.area(),154.0,"Circle area calculation is wrong");
	}
	@Test
	void testRectangleArea() {
		assertEquals(rect.area(),200.0,"Rectangle area calculation is wrong");
	}

}
