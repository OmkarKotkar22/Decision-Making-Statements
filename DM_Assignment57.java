/*Q57. Write a program to input an employee level (1-3) and display the salary range:
1: Junior (20,000 - 30,000)
2: Mid (31,000 - 50,000)
3: Senior (51,000 - 80,000)
Explanation:
 Use switch on the level number and print the salary range.*/

import java.util.*;
public class DM_Assignment57
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Level: ");
		int EmpLevel = sc.nextInt();
		
		switch(EmpLevel)
		{
			case 1:
				System.out.println("Junior (20000 - 30000)");
				break;
				
			case 2:
				System.out.println("Mid (31000 - 50000)");
				break;	

			case 3:
				System.out.println("Senior (51000 - 80000)");
				break;
				
			default:
				System.out.println("Invalid Number");
		}
	}
}