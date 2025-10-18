//Q30. Write a java program to enter month number between(1-12) and print number of days in month using if else. How to print the number of days in a given month using if else in java programming.

import java.util.*;
public class DM_check_month_day
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month: ");
		int month = sc.nextInt();

		if(month == 1)
		{
			System.out.println(31 + " " + "Days");
		}
		else if(month == 2)
		{
			System.out.println(28 + " " + "Days");
		}
		else if(month == 3)
		{
			System.out.println(31 + " " + "Days");
		}
		else if(month == 4)
		{
			System.out.println(30 + " " + "Days");
		}
		else if(month == 5)
		{
			System.out.println(31 + " " + "Days");
		}
		else if(month == 6)
		{
			System.out.println(30 + " " + "Days");
		}
		else if(month == 7)
		{
			System.out.println(31 + " " + "Days");
		}
		else if(month == 8)
		{
			System.out.println(30 + " " + "Days");
		}
		else if(month == 9)
		{
			System.out.println(31 + " " + "Days");
		}
		else if(month == 10)
		{
			System.out.println(30 + " " + "Days");
		}
		else if(month == 11)
		{
			System.out.println(31 + " " + "Days");
		}
		else
		{
			System.out.println(30 + " " + "Days");
		}

	}
}