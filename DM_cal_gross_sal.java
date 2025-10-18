//Q14. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
//                                	Basic Salary <= 10000 : HRA = 20%, DA = 80%
//                                	Basic Salary <= 20000 : HRA = 25%, DA = 90%
//                                	Basic Salary > 20000 : HRA = 30%, DA = 95%


import java.util.*;
public class DM_cal_gross_sal
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary: ");
		int BS = sc.nextInt();

		if(BS<=10000)
		{
			int HRA = (BS*20/100);
			int DA = (BS*80/100);
			BS = BS + HRA + DA;
			System.out.println(BS);
		}
		else if(BS>=10000 && BS<=20000)
		{
			int HRA = (BS*25/100);
			int DA = (BS*90/100);
			BS = BS + HRA + DA;
			System.out.println(BS);	
		}
		else
		{
			int HRA = (BS*30/100);
			int DA = (BS*95/100);
			BS = BS + HRA + DA;
			System.out.println(BS);
		}
	}
}