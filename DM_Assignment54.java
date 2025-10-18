/*Q54. Develop a Java program using switch to print the day type for an input day number (1-7):
1 for Monday, …, 7 for Sunday.
For 1-5, display “Weekday”; for 6-7, display “Weekend”.
Explanation:
 Use switch with multiple cases falling through for weekdays and weekends.*/

import java.util.*;
public class DM_Assignment54
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of day: ");
		int no = sc.nextInt();
		
		switch(no)
		{
			case 1:
				System.out.println("1 for Mon");
				break;
				
			case 2:
				System.out.println("2 for Tues");
				break;	

			case 3:
				System.out.println("3 for Wed");
				break;				
			case 4:
				System.out.println("4 for Thus");
				break;

			case 5:
				System.out.println("5 for Fri");
				break;

			case 6:
				System.out.println("6 for Sat");
				break;
				
			default:
				System.out.println("7 for Sun");
		}
	}
}