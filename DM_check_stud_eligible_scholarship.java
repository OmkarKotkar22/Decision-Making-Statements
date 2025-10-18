/*Q38. Check whether a student is eligible for scholarship:
 
    Attendance >= 75% and marks >= 80**
    Input: Attendance %, marks
    Logic: if-else
    Output: Eligible or not.*/

import java.util.*;
public class DM_check_stud_eligible_scholarship
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Attendence: ");
		int attendance = sc.nextInt();
		
		System.out.println("Enter the marks: ");
		int marks = sc.nextInt();

		if(attendance >= 75 && marks >= 80)
		{
			System.out.println("student is eligible for scholarship");
		}
		else
		{
			System.out.println("student is not eligible for scholarship");
		}
	}
}