//Q26.Write a java program to accept the height of a person in centimeters and categorize the person according to their height.
//                       PerHeight < 150.0  : The person is Dwarf.
//                       PerHeight >= 150.0 && PerHeight < 165.0  :   The person is  average heighted.       	
//                    	 PerHeight >= 165.0 && PerHeight <= 195.0 :  The person is taller.
//                    	Test Data : 135
//                    	Expected Output :
//                    	The person is Dwarf.

import java.util.*;
public class DM_check_height
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Height: ");
		double height = sc.nextInt();

		if(height < 150.0)
		{
			System.out.println("The person is Dwarf.");
		}
		else if(height >= 150.0 && height < 165.0)
		{
			System.out.println("The person is Average Height.");
		}
		else
		{
			System.out.println("The person is Taller.");
		}
	}
}