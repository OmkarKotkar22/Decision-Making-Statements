/*Q37. Check whether the month number is valid and display season.
 
    Input: 1 to 12
    Logic: if-else if to map to Winter/Spring/Summer/Autumn.
    Output: Season.*/

import java.util.*;
public class DM_check_season
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month: ");
		int month = sc.nextInt();
		
		if(month >= 1 && month <= 3)
		{
			System.out.println("map to Winter");
		}
		else if(month >= 4 && month <= 6)
		{
			System.out.println("map to Spring");
		}
		else if(month >= 7 && month <= 9)
		{
			System.out.println("map to Summer");
		}
		else
		{
			System.out.println("map to Autumn");
		}
	}
}