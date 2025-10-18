//Q18. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
import java.util.*;
public class DM_check_stude_pass_fail
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student mark: ");
		int mark = sc.nextInt();
		
		if(mark >= 40)
		{
			System.out.println("Pass");	
		}
		else
		{
			System.out.println("Fail");	
		}
	}
}