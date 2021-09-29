

public class hahah
{
	public static void main(String[] args)
	{
		letsgo nl = new letsgo();
		
		// while loop  (make something, test something, change something)
		/*int count = 0;
		while(count < 10)
		{
			//random number generator numbers generated
			int rand = (int)(Math.random() * 10) * 1;  // + 1 means starts at 1
			nl.add(rand);
			count++;	
		} */
		nl.add(1);
		nl.add(2);
		nl.add(3);
		nl.add(9);
		nl.add(7);
		nl.printList();
		int sum = nl.sum();
		System.out.println("Sum = " + sum);
		int oddSum = nl.sumOfOdds();
		double average = nl.average();
		System.out.println("Average = " + average);
		int sumofsq = nl.sumOfSquares();
		System.out.println("Sum of the evens suared = " + sumofsq);
		
		/*System.out.println("Odd sum = " + oddSum);
		int min = nl.min();
		System.out.println("min val = " + min);
		boolean isTightlyPacked = nl.isTightlyPacked();
		System.out.println("List is tightly packed = " + isTightlyPacked);
		nl.removeMult3();
		nl.printList(); */
	}

}
