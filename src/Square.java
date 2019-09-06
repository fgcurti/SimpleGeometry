// Square class
// Simple example using Junit testing
// fgcurti
// 09/05/2019

public class Square {

	public int side = 5;
	
	public int calculatePerimeter(int side) {
		return 4 * side;
	}

	public int calculateArea(int side) {
		return side * side;
	}

	public boolean areaGreaterThanTwo(int side) {
		return side * side > 2;
	}

}
