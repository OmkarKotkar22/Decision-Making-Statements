/*Q43. Calculate fine for library book return:
Input: Number of days late
Logic:
Up to 5 days → ₹2/day
6–10 days → ₹3/day
11–30 days → ₹5/day
More than 30 days → Membership canceled + ₹500 fine
Output: Total fine + membership status.*/

import java.util.*;
public class DM_cal_library_book
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the late days: ");
		int days = sc.nextInt();

		if(days > 0 && days <= 5)
		{
			System.out.println("Fine \t" + (days * 2) + "\t Membership is ok");
		}
		else if(days >= 6 && days <= 10)
		{
			System.out.println("Fine \t" + (days * 3) + "\t Membership is ok");
		}
		else if(days >= 11 && days <= 30)
		{
			System.out.println("Fine \t" + (days * 5) + "\t Membership is ok");
		}
		else
		{
			System.out.println("Fine\t " + 500 + "\t Membership is cancelled");
		}
	}
}