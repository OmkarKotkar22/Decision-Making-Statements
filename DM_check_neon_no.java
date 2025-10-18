//Q21. Write a java program to check whether a number is neon or not.      	
//        	Input : 9
//        	Output : Neon Number
//        	Explanation: square is 9*9 = 81 and
//        	The sum of the digits of the square is 9. 

import java.util.*;
public class DM_check_neon_no
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		int sq = no*no;
		System.out.println("Square: " + sq);

		int sum = 0;
		int rem = sq % 10;

		sum = sum + rem;
		sq = sq/10;
		
		rem = sq%10;
		sum = sum + rem;

		if(sum == no)
		{
			System.out.println("neon no");
		}
		else
		{
			System.out.println("not neon");
		}
	}
}