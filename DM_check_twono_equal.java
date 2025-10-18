//Q13. Write a java program to accept two integers and check whether they are equal or not.
import java.util.*;
public class DM_check_twono_equal
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number 1: ");
		int no1 = sc.nextInt();

		System.out.println("Enter the Number 2: ");
		int no2 = sc.nextInt();

		if(no1 == no2)
		{
			System.out.println("Number 1 and Number 2 are equal");
		}
		else
		{
			System.out.println("Number 1 and Number 2 are not equal");
		}
	}
}