/* Filename:	Protection.java
 * Author:		Team 1
 * Assignment:	Read in inventory data
 * Section:		IST 242.001
 * Date:		April 3, 2020
 */

//DOCUMENTATION:
// 'input'				= A scanner object that takes user input
// 'GetInt'				= Returns an integer between two values from user input
// 'GetDouble'			= Returns a double between two values from user input
// 'GetString'			= Returns a string of a length between two values from user input
// 'CloseScanner'		= Closes the scanner for user input - DO NOT call until program shutdown sequence
// 'CompareString'		= Compares two string to determine if they are a match

package Test;

import java.util.Scanner;

public class Protection
{
static Scanner input = new Scanner (System.in);
	
	
	public static int GetInt (int Lowerbounds, int Upperbounds)
	{
		String 	UserInput 	= "";
		int		ValidInt	= -1;	
		boolean IsValid = false;
		
		while (IsValid == false || ValidInt < Lowerbounds || ValidInt > Upperbounds )
		{
			IsValid = true;
			
			UserInput = input.nextLine();
			
			try
			{
				ValidInt = Integer.parseInt(UserInput);
				
				if(ValidInt < Lowerbounds || ValidInt > Upperbounds)
				{
					System.out.println("This is not a valid integer...");
					System.out.println("Enter a value between " + Lowerbounds + " and " + Upperbounds + ":");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println ("This is not a valid integer...");
				System.out.println ("Please try again:");
				IsValid = false;
			}
			
		}
		
		return ValidInt;
	}
	
	
	public static double GetDouble (double Lowerbounds, double Upperbounds)
	{
		String 	UserInput 	= "";
		double	ValidDouble	= -1;	
		boolean IsValid = false;
		
		while (IsValid == false || ValidDouble < Lowerbounds || ValidDouble > Upperbounds )
		{
			IsValid = true;
			
			UserInput = input.nextLine();
			
			try
			{
				ValidDouble = Integer.parseInt(UserInput);
				
				if(ValidDouble < Lowerbounds || ValidDouble > Upperbounds)
				{
					System.out.println("This is not a valid integer...");
					System.out.println("Enter a value between " + Lowerbounds + " and " + Upperbounds + ":");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println ("This is not a valid integer...");
				System.out.println ("Please try again:");
				IsValid = false;
			}
	}
		return ValidDouble;
}
	
	
	public static String GetString (int Lowerbounds, int Upperbounds)
	{
		String UserInput = "";
		
		UserInput = input.nextLine();
		
		if (Lowerbounds >= 0 && Upperbounds >= 0)
		{
		
			while (UserInput.length() < Lowerbounds || UserInput.length() > Upperbounds)
			{
				System.out.println ("This is not a valid string...");
				System.out.println ("Please enter a string with a length between " + Lowerbounds + " and " + Upperbounds + ":");
				UserInput = input.nextLine();
			}
		}
		
		return UserInput;
	}
	
	
	public static void CloseScanner()
	{
		input.close();
	}
	

}
