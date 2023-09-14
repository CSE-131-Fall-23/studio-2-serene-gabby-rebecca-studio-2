package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double winChance;
		
		Scanner in = new Scanner(System.in);
		System.out.println("What is your start amount?");
		double startAmount  = in.nextDouble();
		
		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble();
		
		
		//while ((startAmount < winLimit) || (startAmount == 0))
		//{
			//double value = Math.random();
			//System.out.println(value);
			//if (value < 0.5)
				//	{
				//startAmount = startAmount - 1;
				//System.out.println("Ruin");
				//System.out.println(startAmount);
					//}
			//else if (value >= 0.5)
			//{
				//startAmount = startAmount + 1;
				//System.out.println("Success");
				//System.out.println(startAmount);
			//}
		//}
		System.out.println("How many days do you wanna simulate?");
		int totalSimulations = in.nextInt();
		for(int day = 1; day <= totalSimulations; day++) {
			System.out.println("day: "+ day);
		
			
			// here
			double amount = startAmount;
			int round = 1;
			
			while ((amount < winLimit) || (amount == 0))
			{
				double value = Math.random();
				if (value < 0.5)
						{
					amount = amount - 1;
				
					
						}
				else if (value >= 0.5)
				{
					amount = amount + 1;
					
					
				}
				round++;
			}
			if(amount == 0) {
				System.out.println("Ruin");
			}
			else if (amount == winLimit) {
				System.out.println("Success");
			}
			System.out.println("round: "+ round);
		}
	}

}
