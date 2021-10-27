package skills3;

import java.util.ArrayList;
public class ShoppingList 
{
	private ArrayList<Item> list;
	public ShoppingList()
	{
		list = new ArrayList<Item>();
	}
	public void add(Item item)
	{
		list.add(item);
	}
	public double totalCost()
	{
		double cost = 0.0;
		for(Item item : list)
		{
			double price = item.getPrice();
			int quantity = item.getQuantity();
			
		}
		return cost;
	}
	public Item mostExpensive()
	{
		Item expensive = list.get(0);
		for(int index = 0; index < list.size(); index++)
		{
			Item item = list.get(index);
			double price = item.getPrice();
			if(price > expensive.getPrice())
			{
				expensive = item;
			}
		}
		return expensive;
	}
	public Item mostExpensive2()  //foreach loop
	{
		Item expensive = list.get(0);
		for(Item item : list)
		{
			double price = item.getPrice();
			if(price > expensive.getPrice())
			{
				expensive = item;
			}
		}
		return expensive;
	}
}
