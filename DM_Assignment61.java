/*Q61. Write a menu-driven program in java using switch case.
           	1.Addition
           	2.Subtraction
           	3.Multiplication
           	4.Division*/

import java.util.*;
public class DM_Assignment61
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the Num2:");
		int num2 = sc.nextInt();

		System.out.println("Enter the Number: ");	
		int no = sc.nextInt();
		int result;
		
		switch(no)
		{
			case 1:
				result = num1 + num2;
				System.out.println("Result: " + result);
				break;
				
			case 2:
				result = num1 - num2;
				System.out.println("Result: " + result);
				break;	

			case 3:
				result = num1 * num2;
				System.out.println("Result: " + result);
				break;
				
			case 4:
				result = num1 / num2;
				System.out.println("Result: " + result);
				break;

			default:
				System.out.println("Invalid Number");
		}
	}
}