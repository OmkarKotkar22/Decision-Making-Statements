/*Q41. Employee salary hike based on performance and years of service:
Input: Basic salary, Years of service, Performance rating (1–5)
Logic:
If rating >= 4 and service > 5 yrs → 20% hike
Else if rating >= 3 → 10%
Else → 5%
Output: New salary.*/

import java.util.*;
public class DM_check_emp_sal_hikes
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary: ");
		int BS = sc.nextInt();
		
		System.out.println("Enter the Year of Service: ");
		int YOS = sc.nextInt();
		
		System.out.println("Enter the Performance Rating: ");
		int PR = sc.nextInt();

		if(PR>= 4 && YOS > 5)
		{
			System.out.println(" New Salary: " +(BS + (BS * 20)/100));
		}
		else if(PR > 3)
		{
			System.out.println(" New Salary: " +(BS + (BS * 10)/100));
		}
		else
		{
			System.out.println(" New Salary: " +(BS + (BS * 5)/100));
		}
	}
}