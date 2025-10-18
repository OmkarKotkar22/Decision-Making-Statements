/*
Q52: Create a Java program to simulate a simple calculator using a switch case. It should take two numbers and an operator (+, -, *, /, %) as input and perform the corresponding operation.
Explanation:
 Use a switch on the operator to handle different arithmetic operations. Add default to handle invalid operators.
*/

import java.util.*;
public class DM_calculator_use_switch
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A: ");
		int A = sc.nextInt();

		System.out.println("Enter the B: ");
		int B = sc.nextInt();


		System.out.print("Enter your choice (1-5): ");
        	int choice = sc.next().charAt(0);

        	double result; 
		switch(choice)
		{
			case '+':
				result = A + B;
				System.out.println("result: " + result);
				break;

			case '-':
				result = A - B;
				System.out.println("result: " + result);
				break;

			case '*':
				result = A * B;
				System.out.println("result: " + result);
				break;

			case '/':
				result = A / B;
				System.out.println("result: " + result);
				break;

			case '%':
				result = A % B;
				System.out.println("result: " + result);
				break;
		}
	}
}