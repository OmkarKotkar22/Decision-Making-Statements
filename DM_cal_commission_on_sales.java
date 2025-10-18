/*Q39. Calculate commission based on sales amount:
Input: Sales amount
Logic:
Sales < 5000 → 2% commission
Sales 5000–10000 → 5% commission
Sales > 10000 → 10% commission
Output: Display commission amount.*/

import java.util.*;
public class DM_cal_commission_on_sales
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sales: ");
		int sales = sc.nextInt();

		if(sales < 5000)
		{
			int sale = (sales * 2)/100;
			System.out.println("Commission amount: " + sale);
		}
		else if(sales >= 5000 && sales <= 10000)
		{
			int sale = (sales * 5)/100;
			System.out.println("Commission amount: " + sale);
		}
		else
		{
			int sale = (sales * 10)/100;
			System.out.println("Commission amount: " + sale);	
		}
	}
}