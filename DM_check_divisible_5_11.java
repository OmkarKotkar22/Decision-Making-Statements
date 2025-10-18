//Q5. Write a Java program to check whether a number is divisible by 5 and 11 or not.
import java.util.*;
public class DM_check_divisible_5_11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();

		if(no%5 == 0 && no%11 ==0)
		{
			System.out.println("number is divisible by 5 and 11");
		}
		else
		{
			System.out.println("number is not divisible by 5 and 11");
		}
	}
}