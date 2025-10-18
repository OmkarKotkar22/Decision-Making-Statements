/*Q33. There are a total n number of monkeys sitting on the branches of a huge tree. As travelers offer bananas and peanuts, the monkeys jump down the tree. If every Monkey can eat k Bananas and j Peanuts. If the total m number of Bananas and p number of Peanuts are offered by travelers, calculate how many Monkeys remain on the Tree after some of them jumped down to eat.
At a time one Monkey gets down and finishes eating and goes to the other side of the road. The Monkey who climbed down does not climb up again after eating until the other Monkeys finish eating.
Monkeys can either eat k Bananas or j Peanuts. If for the last monkey there are less than k Bananas left on the ground or less than j Peanuts left on the ground, only that Monkey can eat Bananas(<j).
Write code to take inputs as n, m, p, k, j and return the number of Monkeys left on the Tree.
Where,
n= Total no of Monkeys
k= Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than k Bananas)
j = Number of eatable Peanuts by single Monkey(Monkey that jumped down last may get less than j Peanuts)
m = Total number of Bananas
p = Total number of Peanuts
Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility of k and j having a value zero.
Example : Input Values 20  2  3  12  12
    Output Values Number of Monkeys left on the tree : 10
*/

import java.util.Scanner;
public class DM_no_of_monkeys
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total monkeys: ");
		int no = sc.nextInt();
		
		System.out.println("Enter the Number of eatable Bananas by Single Monkey: ");
		int k =sc.nextInt();
		
		System.out.println("Enter the Number of eatable Peanuts by single Monkey: ");
		int j =sc.nextInt();
	
		System.out.println("Enter the Total number of bananas: ");
		int m =sc.nextInt();
		
		System.out.println("Enter the Total number of Peanuts: ");
		int p =sc.nextInt();

		int A = m / k;

		int B = p / j;	

		int sum = A + B;
		System.out.println("Number of Monkeys left on the tree: " + sum);	
	}
}
