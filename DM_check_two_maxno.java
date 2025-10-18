//Q17. Write a java program to find the maximum between two numbers.
import java.util.*;
public class DM_check_two_maxno
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		int no1 = sc.nextInt();
		System.out.println("Enter the Number 2: ");
		int no2 = sc.nextInt();

		if((no1 > no2))
		{
			System.out.println("Number 1 is maximum");
		}
		else
		{
			System.out.println("Number 2 is maximum");
		}
	}
}