/*Q42. Mobile plan billing system:
Input: Minutes used in a month
Logic:
Up to 100 mins → Base ₹199
101–300 mins → ₹199 + ₹1/min for extra
301–500 mins → ₹199 + ₹1.5/min for extra
Above 500 mins → ₹199 + ₹2/min for extra
Output: Total monthly bill.*/

import java.util.*;
public class DM_mobile_plan_billing_system
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Minutes: ");
		int min = sc.nextInt();

		if(min > 0 && min <= 100)
		{
			System.out.println("Total monthly bill: " + 199);
		}
		else if(min >= 101 && min <= 300)
		{	
			int mins = min - 199;
			double a = (mins * 1) + 199;
			System.out.println("Total Monthly bill: " + a);
		}
		else if(min >= 301 && min <= 500)
		{	
			int mins = min - 199;
			double a = (mins * 1.5) + 199;
			System.out.println("Total Monthly bill: " + a);
		}
		else 
		{	
			int mins = min - 199;
			double a = (mins * 2) + 199;
			System.out.println("Total Monthly bill: " + a);
		}
	}
}