/*Q29. Write a java program to input electricity unit charges & calculate total electricity bill according to the given condition
                	For first 50 units Rs. 0.50/unit
                	For next 100 units Rs. 0.75/unit
                	For next 150 units Rs. 1.20/unit
                	For unit above 250 Rs. 1.50/unit
 An additional surcharge of 20% is added to the bill.*/

import java.util.*;
public class DM_check_elec_bill
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Units: ");
		int units = sc.nextInt();

		
		if( units >= 0 && units <= 50)
		{
			double total = units * 0.50;
			double surcharge = (total * 20)/100.0;
			total = total + (double)surcharge; 
			System.out.println("Bill with additional surcharge: " + total);
		}
		else if( units >= 50 && units <= 100)
		{
			double total = units * 0.75;
			double surcharge = (total * 20)/100.0;
			total = total + (double)surcharge; 
			System.out.println("Bill with additional surcharge: " + total);
		}
		else if( units >= 100 && units <= 150)
		{
			double total = units * 1.20;
			double surcharge = (total * 20)/100.0;
			total = total + (double)surcharge; 
			System.out.println("Bill with additional surcharge: "+ total);
		}
		else if( units >= 150 && units <= 250)
		{
			double total = units  * 1.50;
			double surcharge = (total * 20)/100.0;
			total = total + (double)surcharge; 
			System.out.println("Bill with additional surcharge: "+ total);
		}
	}
}