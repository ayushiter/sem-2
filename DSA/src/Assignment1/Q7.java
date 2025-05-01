package Assignment1;
import java.util.*;
public class Q7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array:");
		int n = input.nextInt();
		int [] arr = new int[n];
		System.out.print("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
		arr[i] = input.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		int maxCount = 1;
		int minCount = 1;
		int maxFirstIndex = 0;
		int minLastIndex = 0;
		for (int i = 1; i < n; i++) {
		if (arr[i] > max) {
		max = arr[i];
		maxCount = 1;
		maxFirstIndex = i;
		} else if (arr[i] == max) {
		maxCount++;
		}
		if (arr[i] < min) {
		min = arr[i];
		minCount = 1;
		minLastIndex = i;
		} else if (arr[i] == min) {
		minCount++;
		minLastIndex = i; // Update the last occurrence index
		}
		}
		System.out.println("Maximum element of the array is " + max +" and occurs " + maxCount + " times.");
		System.out.println("Minimum element of the array is " + min +" and occurs " + minCount + " times.");
		System.out.println("First occurrence of maximum element is at position " + (maxFirstIndex + 1));
		System.out.println("Last occurrence of minimum element is at position " + (minLastIndex + 1));
}

}
