/*Q62. Write a menu-driven program in java using switch case.
           	1.Check Number is positive , negative or zero.
           	2.Check Number is even or odd.
           	3.Write a c program to find the max number using 2 numbers.*/

import java.util.*;
public class DM_Assignment62
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Choice: ");
		int choice = sc.nextInt();

		switch(choice)
		{
			case 1 :
				System.out.println("Enter the number:");
				int num = sc.nextInt();
				if(num == 0)
				{
					System.out.println("Number is equal to zero");
				}
				else if (num > 0)
				{
					System.out.println("Number is Positive");
				}
				else
				{
					System.out.println("Number is Negative");
				}
				break;

			case 2:
				System.out.println("Enter the Number: ");
				num = sc.nextInt();

				if(num%2 == 0)
				{
					System.out.println("Number is Even");
				}
				else
				{
					System.out.println("Number is Odd");
				}
				break;

			case 3:
				System.out.println("Enter the Firsr Number: ");
				int num1 = sc.nextInt();

				System.out.println("Enter the second Number: ");
				int num2 = sc.nextInt();

				if(num1 > num2)
				{
					System.out.println("Number 1 is Maximum");
				}

				else if(num2 > num1)
				{
					System.out.println("Number 2 is Maximum");
				}
				
				else
				{
					System.out.println("Both number are equal");
				}
				break;

			default:
				System.out.println("Invalid Number");
		}
	}
}