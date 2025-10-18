/*Q35. Check if a person is a child, teenager, adult, or senior based on age.
 
    Input: Age
    Logic: if-else if
    Output: Age category.*/

import java.util.*;
public class DM_check_age
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();

		if(age >= 1 && age <= 12)
		{
			System.out.println("Child");
		}
		else if(age >= 13 && age <= 19)
		{
			System.out.println("Teenager");
		}
		else if(age >= 18 && age <= 64)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Senior");
		}
	}
}