// Test square class
// Simple example using Junit testing
// fgcurti
// 09/05/2019


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSquare {
	Square mySquare = new Square();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPerimeter() {
		int perimeter = mySquare.calculatePerimeter(5);
		assertEquals(perimeter, 20);
	}

	@Test
	public void testArea() {
		int area = mySquare.calculateArea(5);
		assertEquals(area, 25);
	}

	@Test
	public void testAreaIsBig() {
		boolean bigArea = mySquare.areaGreaterThanTwo(5);
		assertTrue(bigArea);
	}
	
	@Test
	public void testAreaIsNotBig() {
		boolean bigArea = mySquare.areaGreaterThanTwo(1);
		assertFalse(bigArea);
	}

}
