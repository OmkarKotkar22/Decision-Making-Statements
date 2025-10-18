//Q6. Write a Java program to check whether a character is alphabetic or not.
import java.util.*;
public class DM_check_alphabetic
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);

		if((ch >= 'A' && ch <= 'Z') || (ch>='a' && ch<='z'))
		{
			System.out.println("Given Char are Alphabet ");
		}
		else
		{
			System.out.println("Given Char are not Alphabet ");
		}
	}
}