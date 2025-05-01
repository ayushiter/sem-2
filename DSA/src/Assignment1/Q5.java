package Assignment1;
import java.util.*;
public class Q5 {
	public static int sumOfDigits(int n) {
		while (n > 9) { // Continue until n is a single digit
		int sum = 0;
		while (n > 0) {
		sum += n % 10; // Add the last digit to sum
		n /= 10; // Remove the last digit
		}
		n = sum; // Update n with the new sum
		}
		return n;
		}
		public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int result = sumOfDigits(number);
		System.out.println("Sum of digits of " + number + " until the number is a single digit is " + result);
}

}
