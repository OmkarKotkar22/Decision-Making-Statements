//Q12. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
import java.util.*;
public class DM_check_candidate_eligibility
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of Candidate: ");
		int age = sc.nextInt();

		if(age>=18)
		{
			System.out.println("Candidate is Eligible for vote");
		}
		else
		{
			System.out.println("Candidate is not Eligible for vote");

		}
	}
}