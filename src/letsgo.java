package default package
//class that exists in java, have to import it to use that class
import java.util.ArrayList;

//list methods : get, set, add, remove, size

public class NumberList
{
	//use an array list you have to import the array list class
	private ArrayList<Integer> list;
	//lists can only hold objects, not primitives
	//if a list of Strings, it would say String in the pointy braces
	public NumberList()
	{
		list = new ArrayList<Integer>();
	}
	public void add(int num)
	{
		list.add(num);
	}
	public int countEvens()
	{
		int count = 0;
		int index = 0;
		while(index < list.size())
		{
			int num = list.get(index);
			if(num % 2 ==0)
			{
				count++;
			}
		}
		return count;
	}
	public void removeMult3backwrds()
	{
		for(int index = 0; index + 1 < list.size(); index++)
		{
			int num = list.get(index);
			if(num % 3 ==0)
			{
				list.remove(index);
			}
		}
	}
	public void example()
	{
		int val = 0;
		for(int index = 0; index < list.size(); index++)
		{
			int num = list.get(index);
			if(/*do something with num */)
			{
				//do something that changes val
			} 
		}
		return val; 
	} 
	public void removeMult3()
	{
		int index = 0;
		while(index < list.size())
		// or a for loop: for(int index = 0; index < list.size();)
		{
			int num = list.get(index);
			if(num % 3 ==0)
			{
				list.remove(index);
			}
			else
			{
				index++;
			}
		}
	}
	public boolean isTightlyPacked()
	{
		for (int index = 0; index + 1 < list.size(); index++)
		{
			int num1 = list.get(index);
			int num2 = list.get(index + 1);
			int diff = Math.abs(num1-num2);
			if(diff > 2)
			{
				return false;
			}
		}
		return true;
	}
	public int min()
	{
		int min = list.get(0);
		for(int index = 0; index < list.size(); index++)
		{
			int num = list.get(index);
			if(num < min)
			{
				min = num;
			}
		}
		return min;
	}
	public int countMultOf3()
	{
		int count = 0;
		// for loop
		for(int index = 0; index < list.size(); index ++)
		{
			int num = list.get(index);
			if(num % 3 == 0)
			{
				count++;
			}
		}
		return count;
	}
	public int sumOfOdds()
	{
		int sum = 0;
		int index = 0;
		while(index < list.size())
		{
			int num = list.get(index);
			if(num % 2 == 1)
			{
				sum += num;
			}
			index++;
		}
		return sum;
	}
	public int sum()
	{
		int sum = 0;
		int index = 0;
		while(index < list.size())
		{
			int num = list.get(index);
			sum += num;
			index++;
		}
		return  sum;
	}
	public double average()
	{
		int sum = 0;
		for(int index = 0; index < list.size(); index++)
		{
			int num = list.get(index);
			sum +=num;
		}
		//the 9double) castes the variable to a different type
		double average = (double) sum / list.size();
		return average;
	}
	public void printList()
	{
		int index = 0;
		while(index < list.size())
		{
			int num = list.get(index);
			index++;
			System.out.println(num);
		}
	}
	
	
	
}
