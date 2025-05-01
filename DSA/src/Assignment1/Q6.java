package Assignment1;
import java.util.*;
public class Q6 {
	public static boolean isOdd(int n) {
		return (n & 1) == 1;
		}
		public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		boolean odd = isOdd(number);
		System.out.println(number + " is odd: " + odd);
		}

}
