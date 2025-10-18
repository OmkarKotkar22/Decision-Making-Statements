//Q4. Write a Java program to check whether a number is positive , negative or zero.
import java.util.*;
public class DM_check_no_pos_neg_0
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		
		if(no%2 == 0)
		{
			System.out.println("Number is Positive");
		}
		else
		{
			System.out.println("Number is negative");
		}
		System.out.println("Number is not zero");

	}
} 