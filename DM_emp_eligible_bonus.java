/*Q34. Check whether a given employee is eligible for bonus:
 
Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus.*/

import java.util.*;
public class DM_emp_eligible_bonus
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Year: ");
		int year = sc.nextInt();
		if(year >= 5)
		{
			System.out.println("Enter the Salary: ");
			int salary = sc.nextInt();
			if(salary >= 5000 && salary <= 50000)
			{
				System.out.println("Bouns Salary" + (salary + (salary * 5)/100));
			}
		}
		else
		{
			System.out.println("No Bouns");
		}
	}
}
