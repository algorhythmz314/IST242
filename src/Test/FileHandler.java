/* Filename:	FileHandler.java
 * Author:		Team 1
 * Assignment:	Read in inventory data
 * Section:		IST 242.001
 * Date:		April 1, 2020
 */

package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class FileHandler
{		
		static String FileLocation 		= "/home/yoga/Documents/Eclipse Workspace/git/IST242/Inventory.txt";
		static String OutFileLocation 	= "/home/yoga/Documents/Eclipse Workspace/git/IST242/Inventory.txt";
		static File EmployeeFile = new File (FileLocation);
		static File OutFile = new File (OutFileLocation);
		static StringBuilder builder = new StringBuilder();
		

		public static String[][] ReadFile (String FileLocation, int Rows, int Columns)
		{
			String[][] InData = new String[Rows][Columns];
			String line = "";
			int row = 0;
			int column = 0;
			BufferedReader reader;
			
			try
			{
				reader = new BufferedReader(new FileReader(FileLocation));
				while((line = reader.readLine()) != null)
				{
				   String[] cols = line.split(",");
				   column = 0;
				   for(String  c : cols)
				   {
				      InData[row][column] = c;
				      column++;
				   }
				   row++;
				}
				reader.close();
			}
			catch (IOException e) {e.printStackTrace();}		
			
			return InData;
		}
		
		
		public static void WriteFile (String[] ItemID, String[] ItemName, String[] ItemType, double[] Weight, double[] ItemPrice, int NumOfItems)
		{
			int counter = 0;
			//NetPay[counter];
			builder.append("ItemID	ItemName		ItemType	Weight	ItemPrice");
			
			while (counter < NumOfItems)
			{
				
				String FItemPrice 		= Formatter(ItemPrice[counter]);
				
				builder.append(System.getProperty("line.separator"));
				
				builder.append(ItemID[counter] + "		" + ItemName[counter] + "	" + ItemType[counter]
						+ "	" + Weight[counter] + "	" + FItemPrice);
				
				counter++;
			}
			
			
			//builder.append(System.getProperty("line.separator"));
			//builder.append(System.getProperty("line.separator"));
			//builder.append("Department Total");
			//builder.append(System.getProperty("line.separator"));
			//builder.append("Payout			$ " + Formatter(TotalPayout));
			
			BufferedWriter writer;
			try {
				writer = new BufferedWriter(new FileWriter(OutFileLocation));
				writer.write(builder.toString());//save the string representation of the board
				writer.close();
				}
			catch (IOException e) {e.printStackTrace();}
		
		}
			
			
		public static String Formatter (double input)
		{
			DecimalFormat df = new DecimalFormat("0.00");
			String output = df.format(input); 
			
		return output;
		}
		
}