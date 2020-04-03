/* Filename:	FileHandler.java
 * Author:		Team 1
 * Assignment:	Read in inventory data
 * Section:		IST 242.001
 * Date:		April 1, 2020
 */

//This class holds methods related to a console based user interface.....

//DOCUMENTATION:
// 'Pause'					= Causes the program to pause for a specified duration of 'TimeInMilliseoncds'
// 'DisplayWelcomeMessage'	= Prints a short welcome message followed by a delay
// 'DisplayMenu'			= Prints the option menu and returns an integer based on the user's selection
// 'GetNewItem'				= Returns an array of a new item based on user input
// 'GetClearConsole'		= Prints 1000 blank lines to clear the console of whatever information the user was previously viewing
// 'ExitApp'				= Prints an ending message and terminates the program


package Test;

import java.util.Scanner;

//‎⁨Macintosh SSD⁩ ▸ ⁨Users⁩ ▸ ⁨royaleblue⁩ ▸ ⁨git⁩ ▸ ⁨IST242⁩ ▸ ⁨src⁩ ▸ ⁨Test⁩

import java.util.Scanner;

public class Interface
{
	
	public static void DisplayWelcomeMessage()
	{
		System.out.println("Welcome to Majestic 4's Inventory Management; System!");
	}
	
	
	public static void DisplayMenu()
	{
		System.out.println("Enter 1 to Add an Item");
		System.out.println("Enter 2 to Remove an Item");
		System.out.println("Enter 3 to Display Current Items");
		System.out.println("Enter 0 to Exit the Program");
	}
	
	
	public static String[] GetNewItem()
	{
		Scanner input = new Scanner(System.in);
		
		String[] NewItem = new String[5];
		
		System.out.println("Please enter the Item ID");
		NewItem[0] = input.next();
		System.out.println("Please enter the Item Name");
		NewItem[1] = input.next();
		System.out.println("Please enter the Item Type");
		NewItem[2] = input.next();
		System.out.println("Please enter the Item Weight");
		NewItem[3] = input.next();
		System.out.println("Please enter the Item Price");
		NewItem[4] = input.next();
		
		input.close();
		
		return NewItem;
	}

	
	public static void RemoveItem()
	{
		System.out.println("You have selected 'Remove Item'...");
		System.out.println("Please enter the ID of the item you wish to remove");
	}
	
	
	public static void DisplayCurrentItems()
	{
		System.out.println("Here are the current items in the inventory...");
	}
	
	
	public static void Pause(int TimeInMilliseconds)
	{
		try {Thread.sleep(TimeInMilliseconds, 0);}			
		catch (InterruptedException e1) {}
	}
	
	
	public static void GetClearConsole()
	{
		int counter = 0;
		
		while (counter < 1000)
		{
			System.out.println("");
			counter++;
		}
	}
	
	
	public static void ExitApp()
	{
		System.out.println("Thanks for using Majestic 4's Inventory Management System!");
		System.exit(0);
	}
	
}