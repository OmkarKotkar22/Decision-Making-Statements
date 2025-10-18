//Q22. Write a java program to check whether a number is palindrome or not. 
import java.util.*;
public class DM_check_palindrome
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();

		int temp = no;
		int rev =0 , rem = 0;
		rem = no % 10;
		rev = rem * 100;
		no = no / 10;

		rem = no % 10;
		rev =rev + rem * 10;
		no = no / 10;

		rem = no % 10;
		rev = rev + rem * 1;
		
		no = temp;
		if(rev == temp)
		{
			System.out.println("number is palindrome");	
		}
		else
		{
			System.out.println("number is not palindrome");
		}
	}
}