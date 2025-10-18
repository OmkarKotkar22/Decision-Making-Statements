/*
Q53. Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:
A: Excellent
B: Good
C: Average
D: Poor
F: Fail
Explanation:
 Use a char or string in switch to match grades and print remarks.
*/
import java.util.*;
public class DM_Assignment53
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Grade: ");
		char grade = sc.next().charAt(0);

		switch(grade)
		{
			case 'A':
				System.out.println("Excellent");
				break;

			case 'B':
				System.out.println("Good");
				break;

			case 'C':
				System.out.println("Average");
				break;

			case 'D':
				System.out.println("Poor");
				break;

			default:
				System.out.println("Fail");
				break;
		}
	}
}