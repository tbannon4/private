package skills3;

import java.util.ArrayList;

public class MathPractice 
{
	public int sumOfEventsNotDivBySix(ArrayList<Integer> list)
	{
		int sum = 0;
		for(int index = 0; index < list.size(); index ++)
		{
			int num = list.get(index);
			if(num % 2 == 0 && num % 6 == 1)
			{
				sum++;
			}
		}
		return sum;
	}
}
