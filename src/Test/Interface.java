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
	ArrayList<ArrayList<String>> Items = new ArrayList<ArrayList<String>>();
	
	public Interface()
	{
		this.ItemProperties.add("ItemID");
	}
	
	
	public static void DisplayWelcomeMessage()
	{
		System.out.println();
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
	
	
	public void GetNewItem()
	{
		ArrayList<String> NewItem = new ArrayList<String>();
		int counter = 0;
		
		while (counter < this.ItemProperties.size())
		{
			System.out.println("Please enter the " + ItemProperties.get(counter));
			NewItem.add(counter, Protection.GetString(-1, -1));
			counter++;
		}
		
		Items.add(NewItem);
	}

	
	public void RemoveItem()
	{
		System.out.println("You have selected 'Remove Item'...");
		System.out.println("Please enter the ID of the item you wish to remove");
		System.out.println("THIS FUNCTION IS NOT YET IMPLEMENTED");
		System.out.println();
	}
	
	
	public void DisplayCurrentItems()
	{
		int rows			= Items.size();
		int columns			= Items.get(0).size();
		int rowcounter		= 0;
		int columncounter	= 0;
		
		System.out.println("Here are the current items in the inventory...");
		DisplayItemProperties();
		
		while (rowcounter < rows)
		{
			while (columncounter < columns)
			{
				System.out.print(Items.get(rowcounter).get(columncounter) + "	");
				
				columncounter++;
			}
			
			System.out.println();
			columncounter = 0;
			rowcounter++;
			
		}
		System.out.println();
	}
	
	
	public static void DisplayOptions()
	{
		System.out.println("Enter 1 to Add Item Properties");
		System.out.println("Enter 2 to View Item Properties");
		System.out.println("Enter 0 to Exit");
	}
	
	
	public void DisplayItemProperties()
	{
		System.out.println();
		int counter = 0;
		
		while (counter < this.ItemProperties.size())
		{
			System.out.print(ItemProperties.get(counter) + "	");
			counter++;
		}
		
		System.out.println();
		System.out.println();
		
	}
	
	
	public void AddItemProperties()
	{
		System.out.println("Add the name of each Item Property followed by the enter key...");
		System.out.println("Enter a '0' at any time to save and exit");
		
		String input = "";
		
		while (!(input.equals("0")))
		{
			input = Protection.GetString(-1, -1);
			this.ItemProperties.add(input);
		}
		
		ItemProperties.remove((ItemProperties.size()-1));		
		System.out.println();
		
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