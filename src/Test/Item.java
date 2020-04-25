package Test;
/* Filename:	Item.java
 * Author:		Team 1
 * Assignment:	Contains functions and methods invoked on a single item in the inventory
 * Date:		April 24, 2020
 */

public class Item extends Inventory
{
	String ItemID;
	String Name;
	String Type;
	String Price;
	
	
	public Item()
	{
		
	}
	
	public Item (String ItemID)
	{
		this.ItemID = ItemID;
		
	}
	
}
