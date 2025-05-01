package Assignment1;
import java.util.*;
public class Q8 {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in); 
			 
	        System.out.print("Enter the number of rows and columns of the 2D array: "); 
	        int rows = input.nextInt(); 
	        int cols = input.nextInt(); 
	 
	        int[][]arr = new int[rows][cols]; 
	        System.out.println("Enter the elements of the 2D array: "); 
	        for (int i = 0; i < rows; i++) { 
	            for (int j = 0; j < cols; j++) { 
	                arr[i][j] = input.nextInt(); 
	            } 
	        } 
	 
	        System.out.println("The elements of the 2D array are: "); 
	        for (int i = 0; i < rows; i++) { 
	            for (int j = 0; j < cols; j++) { 
	                System.out.print(arr[i][j] + " "); 
	            } 
	            System.out.println(); 
	        } 
	 
	        int sum = 0; 
	        for (int i = 0; i < rows; i++) { 
	            for (int j = 0; j < cols; j++) { 
	                sum += arr[i][j]; 
	            } 
	        } 
	 
	        System.out.println("The sum of the elements of the 2D array is " + sum); 
	    } 


}
