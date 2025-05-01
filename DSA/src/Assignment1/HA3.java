package Assignment1;
import java.util.*;
public class HA3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in); 
		 
	        System.out.print("Enter the length of the arrays: "); 
	        int n = input.nextInt(); 
	 
	        int a = new int[n]; 
	        int b = new int[n]; 
	        int c = new int[n]; 
	 
	        System.out.print("Enter the elements of array a: "); 
	        for (int i = 0; i < n; i++) { 
	            a[i] = input.nextInt(); 
	        } 
	 
	        System.out.print("Enter the elements of array b: "); 
	        for (int i = 0; i < n; i++) { 
	            b[i] = input.nextInt(); 
	        } 
	 
	        for (int i = 0; i < n; i++) { 
	            c[i] = a[i] * b[i]; 
	        } 
	 
	        System.out.print("The dot product of a and b is: "); 
	        for (int i = 0; i < n; i++) { 
	            System.out.print(c[i] + " "); 
	        } 
	        System.out.println(); 
	    } 

}
