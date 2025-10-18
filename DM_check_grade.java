//Q19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.
import java.util.*;
public class DM_check_grade
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student mark: ");
		int mark = sc.nextInt();
		
		if(mark >= 90)
		{
			System.out.println("Excellent");	
		}
		else if((mark >= 75) && (mark <= 90))
		{
			System.out.println("Good");	
		}
		else if((mark >= 50) && (mark <= 75))
		{
			System.out.println("Average");	
		}
		else
		{
			System.out.println("Poor");
		}
	}
}