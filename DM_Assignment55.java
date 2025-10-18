/*Q55. Write a program to input a character and check whether it is a vowel or consonant using a switch case.
Explanation:
 Switch on the lowercase character. Use cases for 'a', 'e', 'i', 'o', 'u'; default for consonant.*/

import java.util.*;
public class DM_Assignment55
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char character = sc.next().charAt(0);
		
		switch(character)
		{
			case 'a':
				System.out.println("Vowel");
				break;
				
			case 'e':
				System.out.println("Vowel");
				break;	

			case 'i':
				System.out.println("Vowel");
				break;
				
			case 'o':
				System.out.println("Vowel");
				break;

			case 'u':
				System.out.println("Vowel");
				break;

				
			default:
				System.out.println("consonant");
		}
	}
}