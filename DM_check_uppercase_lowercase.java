//Q24. Write a java program to check whether a character is uppercase or lowercase alphabet.
import java.util.*;
public class DM_check_uppercase_lowercase
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Charcter: ");
		char ch = sc.next().charAt(0);
		
		if(ch >= 65 && ch <= 95)
		{
			System.out.println("Character is an Upper case");
		}
		else
		{
			System.out.println("Character is an lower case");
		}
	}
}