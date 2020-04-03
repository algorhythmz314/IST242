/* Filename:	FileHandler.java
 * Author:		Team 1
 * Assignment:	Read in inventory data
 * Section:		IST 242.001
 * Date:		April 1, 2020
 */

package Test;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
	System.out.println("Welcome to Majestic 4's Inventory Management; System!");
	System.out.println("Enter 1 to Add an Item");
	System.out.println("Enter 2 to Remove an Item");
	System.out.println("Enter 0 to Exit the Program");
	
	//sub-menu 1
	System.out.println("Please enter the Item ID");
	System.out.println("Please enter the Item Name");
	System.out.println("Please enter the Item Type");
	System.out.println("Please enter the Item Weight");
	System.out.println("Please enter the Item Price");
	System.out.println("Please enter the Number of Items");
	
	//sub-menu 2
	System.out.println("Please enter the Item ID");
	
	//sub-menu 3
	System.out.println("Thanks for using Majestic 4's Inventory Management System!");
	System.exit(0);

	
	
	
	Scanner consoleValue = new Scanner(System.in);
	System.out.println("Enter 0, 1, or 2");
	int numberEntered = consoleValue.nextInt();
	
	//if (numberEntered = 0)
	//{addItem();}
	//else if (numberEntered = 1)
	//else if
	//else()
	System.exit(0);
	}
}