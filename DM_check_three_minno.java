//Q16. Write a java program to find a minimum between three numbers.
import java.util.*;
public class DM_check_three_minno
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		int no1 = sc.nextInt();
		System.out.println("Enter the Number 2: ");
		int no2 = sc.nextInt();
		System.out.println("Enter the Number 3: ");
		int no3 = sc.nextInt();

		if((no1 <= no2) && (no1 <= no3))
		{
			System.out.println("Number 1 minimum");
		}
		else if((no2 <= no1) && (no2 <= no3))
		{
			System.out.println("Number 2 minimum");
		}
		else
		{
			System.out.println("Number 3 minimum");
		}
	}
}