/* Filename:	Main.java
 * Author:		Team 1
 * Assignment:	Read in inventory data
 * Section:		IST 242.001
 * Date:		April 1, 2020
 */

//This class contains the main method

package Test;

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{

	public static void main(String[] args) 
	{
		Interface I = new Interface();
		Scanner in = new Scanner(System.in);
		
		int input;
		String[][] ItemIndex = {{"0", "1", "2", "3", "4",},
								{"0", "1", "2", "3", "4",},
								{"0", "1", "2", "3", "4",},
								{"0", "1", "2", "3", "4",}};
		
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
		else if (input  == 4)
		{
			Interface.DisplayOptions();
			input = Integer.parseInt(in.next());
			if(input == 1)
			{
				Interface.DisplayAddItemProperties();
			}
			if (input == 2)
			{
				I.DisplayItemProperties();
			}
			if (input == 0);
			{
				System.exit(0);
			}
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