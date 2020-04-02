package Test;
import java.util.Scanner;

//‎⁨Macintosh SSD⁩ ▸ ⁨Users⁩ ▸ ⁨royaleblue⁩ ▸ ⁨git⁩ ▸ ⁨IST242⁩ ▸ ⁨src⁩ ▸ ⁨Test⁩
public class Interface {

	public static void main(String[] args) 
	{
	System.out.println("Welcome to Majestic 4's Inventory Management; System!");
	System.out.println("Enter 1 to Add an Item");
	System.out.println("Enter 2 to Remove an Item");
	System.out.println("Enter 0 to Exit the Program");
	
	
	
	Scanner consoleValue = new Scanner(System.in);
	System.out.println("Enter 0, 1, or 2");
	int numberEntered = consoleValue.nextInt();

}}
