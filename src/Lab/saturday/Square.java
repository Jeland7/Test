package Lab.saturday;
/**
Calculates the area of a square given a side 
SaturdayLab1: Data types. Variables. Constants. Problem 2

Write a java program that declares a variable to represent the side of a square.
The side of the square is 7 units. Compute and display the area of the square.
Save the program as Square.java */


public class Square {

	
	public static void main(String[] args) {
		
		int sideLength = 7;
		int result = sideLength * sideLength;
		
		System.out.println("Square is " + result);

	}

}
