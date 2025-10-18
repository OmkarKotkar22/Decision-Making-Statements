//Q1. Write a Java program to check whether a number is even or odd.
import java.util.*;
public class DM_even_odd
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();
		
		if(no%2 == 0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}