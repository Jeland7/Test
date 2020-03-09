package Lab.saturday;
import java.util.Scanner;

public class ChangeCalculator {

	/**
	 Calculates the change owned to a customer.
	 
	 SaturdayLab1: Data types. Variables. Constants.
	 
	 Problem 7 
	 
	 ChangeCalculator is an application that helps a seller to give the right
	 change to a customer. The application prompts the user to enter the total
	 price of the items bought and the received received from the customer. The
	 application calculates and displays the change the customer is owed. In
	 addition, the application calculates and displays the maximum number of
	 how many EUR 50, EUR 20, EUR 10 and EUR 5 notes, and how many
	 EUR 2 and EUR 1 coins the seller has to give to the customer as change.
	 For simplicity, let's consider that the seller does not want to deal with small
	 coins (i.e. 50c, 20c, etc.), therefore although the total price of the items
	 bought may be a decimal number the seller will enter the price rounded
	 down to the nearest euro (e.g. 24.7 will be rounded down to 24). 
	 
	 Write, compile and test whether the application provides the right change.
	 Save the class as ChangeCalculator.java
	 */
	
	public static void main(String[] args) {
		
		int price, received, change;
		int pay50, pay20, pay10, pay5, pay2, pay1;
		System.out.println("Test");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the price");
		price = sc.nextInt();
		System.out.println("Please enter amount received");
		received = sc.nextInt();
		
		change = received - price;
		String res = "Change: ";
		System.out.println(res + change);
		
		pay50 = change / 50;
		System.out.println("50EUR notes: " + pay50);
		change = change - 50 * pay50;
		
		pay20 = change / 20;
		System.out.println("20EUR notes: " + pay20);
		change = change - 20 * pay20;
		
		pay10 = change / 10;
		System.out.println("10EUR notes: " + pay10);
		change = change - 10 * pay10;
		
		pay5 = change / 5;
		System.out.println("5EUR notes: " + pay5);
		change = change - 5 * pay5;
		
		pay2 = change / 2;
		System.out.println("2EUR notes: " + pay2);
		change = change - 2 * pay2;
		
		pay1 = change / 1;
		System.out.println("1EUR notes: " + pay1);
		change = change - 1 * pay1;
		
	}

}
