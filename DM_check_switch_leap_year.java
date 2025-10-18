/*Q51: Write a Java program using a switch case to input a month number (1-12) and display the number of days in that month. Consider leap year for February.
Explanation:
 Use a switch for month numbers. For February, check if the year is a leap year using an if condition inside the case.
*/

import java.util.*;
public class DM_check_switch_leap_year
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month: ");
		int month = sc.nextInt();

		switch(month)
		{
			case 1:
				System.out.println("Jan has 31 days");
				break;
			
			case 2:
				System.out.println("Enter the year: ");
				int year = sc.nextInt(); 
				
				if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				{	
					System.out.println("this is leap year has 29 days ");
				}
				else
				{
					System.out.println("Feb has 28 days");
				}
				break;
		
			case 3:
				System.out.println("Mar has 31 days");
				break;

			case 4:
				System.out.println("Apr has 30 days");
				break;

			case 5:
				System.out.println("May has 31 days");
				break;

			case 6:
				System.out.println("Jun has 30 days");
				break;

			case 7:
				System.out.println("Jul has 31 days");
				break;

			case 8:
				System.out.println("Aug has 30 days");
				break;

			case 9:
				System.out.println("Sep has 31 days");
				break;

			case 10:
				System.out.println("Oct has 30 days");
				break;

			case 11:
				System.out.println("Nov has 31 days");
				break;	

			case 12:
				System.out.println("Dec has 30 days");
				break;
			default:
				System.out.println("Invalid");
		}
	}
}