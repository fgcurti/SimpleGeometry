// Test Triangle class
// Simple example using Junit testing
// fgcurti
// 09/05/2019


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTriangle {
	Triangle myTriangle = new Triangle();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPerimeter() {
		int perimeter = myTriangle.calculatePerimeter(5);
		assertEquals(perimeter, 15);
	}
	

}
