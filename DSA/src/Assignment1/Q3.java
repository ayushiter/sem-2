                                   // find the spy number Since sum = product, 1124 is a spy number.

package Assignment1;
import java.util.*;
public class Q3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);         // input
		System.out.print("Enter a number: ");           // 
		int number = input.nextInt();                   // strored the input value in the form of number 
		int originalNumber = number;                    // 
		int sum = 0;                                    // assigned the intial value of sum
		int product = 1;                                // assigned the intial value of product
		while (number > 0) {
		int digit = number % 10;
		sum += digit;
		product *= digit;
		number /= 10;
		}
		if (sum == product) {
		System.out.println(originalNumber + " is a spy number.");
		} else {
		System.out.println(originalNumber + " is not a spy number.");
		}

	}

}
