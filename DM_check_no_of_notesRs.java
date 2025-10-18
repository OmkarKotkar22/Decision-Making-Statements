 /*Q25.Write a java program to find the total number of notes in a given amount.  
                    	
            Enter the amount: 2528
Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1
*/

import java.util.Scanner;
public class DM_check_no_of_notesRs
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int amount = sc.nextInt();

		int n500 = amount / 500;
		amount = amount % 500;

		int n200 = amount / 200;
		amount = amount % 200;

		int n100 = amount / 100;
		amount = amount % 100;

		int n50 = amount / 50;
		amount = amount % 50;

		int n20 = amount / 20;
		amount = amount % 20;

		int n10 = amount / 10;
		amount = amount % 10;

		int n5 = amount / 5;
		amount = amount % 5;

		int n2 = amount / 2;
		amount = amount % 2;

		int n1 = amount / 1;
		amount = amount % 1;

		System.out.println("Notes 500: " + n500);
		System.out.println("Notes 200: " + n200);
		System.out.println("Notes 100: " + n100);
		System.out.println("Notes 50: " + n50);
		System.out.println("Notes 20: " + n20);
		System.out.println("Notes 10: " + n10);
		System.out.println("Notes 5: " + n5);
		System.out.println("Notes 2: " + n2);
		System.out.println("Notes 1: " + n1);
	}
}