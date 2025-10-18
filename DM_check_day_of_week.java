//Q31. Write a java program to input week number(1-7) and print the corresponding day of week name using if else. How to print day of week using if else in java programming.
import java.util.*;
public class DM_check_day_of_week
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Week: ");
		int week = sc.nextInt();

		if(week == 1)
		{
			System.out.println( "Sun");
		}
		else if(week == 2)
		{
			System.out.println( "Mon");
		}
		else if(week == 3)
		{
			System.out.println( "Tues");
		}
		else if(week == 4)
		{
			System.out.println( "Wed");
		}
		else if(week == 5)
		{
			System.out.println( "Thus");
		}
		else if(week == 6)
		{
			System.out.println( "Fri");
		}
		else if(week == 7)
		{
			System.out.println( "Sat");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}