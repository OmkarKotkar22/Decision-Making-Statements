//Q11. Write a java program to find a maximum between three numbers.
import java.util.*;
public class DM_check_maxno
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number1: ");
		int no1 = sc.nextInt();

		System.out.println("Enter the Number2: ");
		int no2 = sc.nextInt();

		System.out.println("Enter the Number3: ");
		int no3 = sc.nextInt();

		if((no1 > no2) && (no1 > no3))
		{
			System.out.println("No1 is Greater");
		} 
		else if((no2 > no1) && (no2 > no3))
		{
			System.out.println("No2 is Greater");
		}
		else
		{
			System.out.println("No3 is Greater");
		}
	}
}