//Q8. Write a Java program to check whether a year is a leap year or not.
import java.util.*;
public class DM_check_leapyear
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		
		if(year%4 == 0)
		{
			System.out.println("It is a Leap year");
		}
		else
		{
			System.out.println("It is not a Leap year");
		}
	}
}