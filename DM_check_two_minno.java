//Q15. Write a java program to find the minimum between two numbers.
import java.util.*;
public class DM_check_two_minno
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		int no1 = sc.nextInt();

		System.out.println("Enter the Number 2: ");
		int no2 = sc.nextInt();

		if(no1 > no2)
		{
			System.out.println("Number 2 is Minimum");
		}
		else
		{
			System.out.println("Number 1 is Minimum");

		}
	}
}