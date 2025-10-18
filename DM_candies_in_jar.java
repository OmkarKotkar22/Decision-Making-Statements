/*Q33. There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR can contain maximum N candies when JAR is full. At any point of time. JAR can have M number of Candies where M<=N. Candies are served to the customers. JAR never remains empty as when the last k candies are left. JAR is refilled with new candies in such a way that JAR gets full. Write a code to implement the above scenario. Display JAR at the counter with the available number of candies. Input should be the number of candies one customer can order at a point of time. Update the JAR after each purchase and display JAR at Counter.
Output should give the number of Candies sold and the updated number of Candies in JAR. If Input is more than candies in JAR, return: “INVALID INPUT”.
Given,
N=10, where N is NUMBER OF CANDIES AVAILABLE
K =< 5, where k is the number of minimum candies that must be inside JAR ever.
Example 1:  	(N = 10, k =< 5)
• Input Value - 3
• Output Value - NUMBER OF CANDIES SOLD : 3
-        NUMBER OF CANDIES AVAILABLE : 7
Example :    	(N=10, k<=5)
• Input Value - 0
• Output Value - INVALID INPUT
-        NUMBER OF CANDIES LEFT : 10*/

import java.util.*;
public class DM_candies_in_jar
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int M, N = 10, K = 5;
		System.out.println("Enter the number of candies: ");
		M = sc.nextInt();

		if(M > K || M <= 0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			System.out.println("NUMBER OF CANDIES SOLD" + M);
			System.out.println("NUMBER OF CANDIES AVAILABLE" + (N-M));
		}
	}
}
