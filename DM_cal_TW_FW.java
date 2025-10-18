/*Q32. An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:
• 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
• 2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :
Input : • 200 -> Value of V
• 540 -> Value of W
Output : • TW =130   FW=70
Explanation: 130+70 = 200 vehicles (70*4)+(130*2)= 540 wheels*/


import java.util.*;
public class DM_cal_TW_FW
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vehicles");
		int TV = sc.nextInt();
		
		
		System.out.println("Enter the Wheels");
		int TW = sc.nextInt();

		int A = (TW - 2*TV);

		int F =  (A)/2;

		int T = TV - F;

		System.out.println("Total Four wheeler: "+F);
		System.out.println("Total Two Wheelers: "+T);
	}
}

/*
        // Step 3: Check if the input is valid
        // For example, each vehicle must have at least 2 wheels, and total wheels must be even
        if (W < 2 * V || W % 2 != 0) {
            System.out.println("Invalid input. Please check your numbers.");
            return; // Exit the program
        }

*/
