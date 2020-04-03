/* Filename:	FileHandler.java
 * Author:		Team 1
 * Assignment:	Read in inventory data
 * Section:		IST 242.001
 * Date:		April 1, 2020
 */

//This class contains the main method

package Test;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int input;
		String[][] ItemIndex = {{"", "", "", "", "",},
								{"", "", "", "", "",},
								{"", "", "", "", "",},
								{"", "", "", "", "",}};
		
		Interface.DisplayWelcomeMessage();
		
		Interface.DisplayMenu();
	
		input = Integer.parseInt(in.next());
		
		if(input == 1)
		{
			Interface.GetNewItem();
		}
		else if (input == 2)
		{
			Interface.RemoveItem();
		}
		else if (input == 3)
		{
			Interface.DisplayCurrentItems(ItemIndex);
		}
		else if (input == 0)
		{
			Interface.ExitApp();
		}
		else
		{
			System.out.println("The input is not valid");
		}
		
		in.close();
	
	}
}