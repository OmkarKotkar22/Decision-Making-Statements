/*Q58. Develop a program to simulate a basic banking menu:
 1: Deposit
 2: Withdraw
 3: Check Balance
 4: Exit
 Use a switch to handle user choice and print appropriate messages.
Explanation:
 Switch on user choice. Use variables for balance and update accordingly.*/

import java.util.*;
public class DM_Assignment58
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the menu: ");
		System.out.println("1. Deposit ");
		System.out.println("2. Withdraw ");
		System.out.println("3. Check Balance ");
		System.out.println("4. Exit ");	
	
		int no = sc.nextInt();
		
		switch(no)
		{
			case 1:
				System.out.println("Deposit");
				break;
				
			case 2:
				System.out.println("Withdraw");
				break;	

			case 3:
				System.out.println("Check Balance ");
				break;
				
			case 4:
				System.out.println("Exit");
				break;

			default:
				System.out.println("Invalid Number");
		}
	}
}