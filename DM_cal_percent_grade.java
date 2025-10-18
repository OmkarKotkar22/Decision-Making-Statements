//Q27. Write a java program to input marks of five subjects Physics, Chemistry, Biology,
//        	    Mathematics and Computer, calculate percentage and grade according to given conditions:
//                    	percentage >= 90% : Grade A
//                    	percentage >= 80% : Grade B
//                    	percentage >= 70% : Grade C
//                    	percentage >= 60% : Grade D
//                    	percentage >= 40% : Grade E
//                    	percentage < 40% : Grade F

import java.util.*;
public class DM_cal_percent_grade
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Physics Mark: ");
		int Physics = sc.nextInt();
		
		System.out.println("Enter the Chemistry Mark: ");
		int Chemistry = sc.nextInt();

		System.out.println("Enter the Biology Mark: ");
		int Biology = sc.nextInt();

		System.out.println("Enter the Mathematics Mark: ");
		int Mathematics = sc.nextInt();

		System.out.println("Enter the Computer Mark: ");
		int Computer = sc.nextInt();

		double sum = (double)(Physics + Chemistry + Biology + Mathematics + Computer)/500;
		System.out.println("Sum: " +sum);
		double percentage =(double)(sum*100.0);
		System.out.println("Percentage: " + percentage);

		if(percentage >= 90)
		{
			System.out.println("Grade A");
		}
		else if(percentage >= 80 && percentage <= 90)
		{
			System.out.println("Grade B");
		}

		else if(percentage >= 70 && percentage <= 80)
		{
			System.out.println("Grade C");
		}

		else if (percentage >= 60 && percentage <= 70)
		{
			System.out.println("Grade D");
		}

		else if (percentage >= 40 && percentage <= 60)
		{
			System.out.println("Grade E");
		}

		else{
			System.out.println("Grade F");
		}
	}
}