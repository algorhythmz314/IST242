/* Filename:	Interface.java
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

import java.util.ArrayList;
import java.util.Scanner;

//‎⁨Macintosh SSD⁩ ▸ ⁨Users⁩ ▸ ⁨royaleblue⁩ ▸ ⁨git⁩ ▸ ⁨IST242⁩ ▸ ⁨src⁩ ▸ ⁨Test⁩

import java.util.Scanner;

public class Interface
{
	ArrayList<String> ItemProperties = new ArrayList<String>();	
	
	public Interface()
	{
		this.ItemProperties.add("ItemID");
	}
	
	
	
	
	public static void DisplayWelcomeMessage()
	{
		System.out.println("Welcome to Majestic 4's Inventory Management System!");
		System.out.println();
		
		Pause(500);
	}
	
	
	public static void DisplayMenu()
	{
		System.out.println("Enter 1 to Add an Item");
		System.out.println("Enter 2 to Remove an Item");
		System.out.println("Enter 3 to Display Current Items");
		System.out.println("Enter 4 to Display Options");
		System.out.println("Enter 0 to Exit the Program");
		System.out.println();
		
		Pause(500);
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
	
	
	public static void DisplayCurrentItems(String[][] ItemIndex)
	{
		int rows			= 0;
		int columns			= 0;
		int rowcounter		= 0;
		int columncounter	= 0;
		
		rows 	= ItemIndex.length;
		columns = ItemIndex[0].length;
		
		System.out.println("Here are the current items in the inventory...");
		System.out.println();
		
		while (rowcounter < rows)
		{
			while (columncounter < columns)
			{
				System.out.print(ItemIndex[rowcounter][columncounter] + ", ");
				
				columncounter++;
			}
			
			System.out.println();
			columncounter = 0;
			rowcounter++;
			
		}
		
	}
	
	
	public static void DisplayOptions()
	{
		System.out.println("Enter 1 to Add Item Properties");
		System.out.println("Enter 2 to View Item Properties");
		System.out.println("Enter 0 to Exit");
	}
	
	
	public void DisplayItemProperties()
	{
		int counter = 0;
		
		while (counter < this.ItemProperties.size())
		{
			System.out.println(ItemProperties.get(counter) + "	");
			counter++;
		}
	}
	
	
	public static void DisplayAddItemProperties()
	{
		System.out.println("Add the name of each Item Propery followed by the enter key...");
		System.out.println("Enter a '0' at any time to save and exit");
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