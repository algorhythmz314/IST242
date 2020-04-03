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
		
		int input = -1;
		
		Interface.DisplayWelcomeMessage();
		
		
		while (input != 0)
		{
			
			Interface.DisplayMenu();
			
			input = Protection.GetInt(0, 4);
		
			if(input == 1)
				I.GetNewItem();
				
			if (input == 2)
				I.RemoveItem();
			
			if (input == 3)
				I.DisplayCurrentItems();
			
			if (input  == 4)
			{
				input = -1;
				
				while (input != 0)
				{
					Interface.DisplayOptions();
					input = Protection.GetInt(0, 2);
					
					if(input == 1)
						I.AddItemProperties();
					
					if (input == 2)
						I.DisplayItemProperties();

				}
				input = -1;
			}
		}
		
		Interface.ExitApp();
		
	}
}

