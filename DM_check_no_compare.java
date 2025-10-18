/*Q36. Compare two numbers: greater, smaller, or equal.
 
    Input: Two integers
    Logic: if-else if
    Output: Greater, smaller, or equal.*/

import java.util.*;
public class DM_check_no_compare
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int no1 = sc.nextInt();
		
		System.out.println("Enter the number 2: ");
		int no2 = sc.nextInt();

		
		if(no1 > no2 )
		{
			System.out.println("Numbers are Greater");
		}
		else if(no1 < no2 )
		{
			System.out.println("Numbers are Greater");
		}
		else
		{
			System.out.println("Numbers are Equal");
		}
	}
}