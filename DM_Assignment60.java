/*Q60. Create a Java program to simulate a basic food ordering system using switch:
 1: Burger
 2: Pizza
 3: Pasta
 4: Sandwich
 Display the price for the selected item.
Explanation:
 Switch on food item number. Print item name and price. Default for invalid selection.*/


import java.util.*;
public class DM_Assignment60
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		System.out.println("1. Burger ");
		System.out.println("2. Pizza ");
		System.out.println("3. Pasta ");
		System.out.println("4. Sandwich ");	
	
		int no = sc.nextInt();
		
		switch(no)
		{
			case 1:
				System.out.println("Burger Price:(Rs.99)");
				break;
				
			case 2:
				System.out.println("Pizza Price:(Rs.199)");
				break;	

			case 3:
				System.out.println("Pasta Price(Rs.99) ");
				break;
				
			case 4:
				System.out.println("Sandwich Price:(Rs.100)");
				break;

			default:
				System.out.println("Invalid Number");
		}
	}
}