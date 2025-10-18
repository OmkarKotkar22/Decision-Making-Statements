//Q10. Write a java program to input any character and check whether it is alphabet, digit or special character.
import java.util.*;
public class DM_check_alphabe_digit_specialchar
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);
		
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		{
			System.out.println("Character is the Alphabet");
		}

		else if(ch>='0' && ch<='9')
		{
			System.out.println("Character is the Digit");
		}
		else
		{
			System.out.println("Character is the special character");
		}
	}
}