//Q7. Write a Java program to input cost price and selling price of a product and check profit or loss.
import java.util.*;
public class DM_check_profit_loss
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Cost Price: ");
		int CP = sc.nextInt();

		System.out.println("Enter the Selling Price: ");
		int SP = sc.nextInt();

		if(CP < SP)
		{
			System.out.println("Seller get Profit");
		}
		else
		{
			System.out.println("Seller get Loss");
		}
	}
}