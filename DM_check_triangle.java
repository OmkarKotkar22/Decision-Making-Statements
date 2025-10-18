//Q2. Write a Java program to check whether a triangle is valid or not.
import java.util.*;
public class DM_check_triangle
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the angle1: ");
		int angle1 = sc.nextInt();

		System.out.println("Enter the angle2: ");
		int angle2 = sc.nextInt();

		System.out.println("Enter the angle3: ");
		int angle3 = sc.nextInt();

		
		if(angle1 + angle2 + angle3 == 180)
		{
			System.out.println("Triangle is valid");
		}
		else
		{
			System.out.println("Triangle is not valid");
		}
	}
}