package Assignment1;
import java.util.*;
public class HA1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in); 
		 
	        System.out.print("Enter three integers (a, b, c): "); 
	        int a = input.nextInt(); 
	        int b = input.nextInt(); 
	        int c = input.nextInt(); 
	 
	        if (a + b == c) { 
	            System.out.println(a + " + " + b + " = " + c); 
	        } else if (a == b - c) { 
	            System.out.println(a + " = " + b + " - " + c); 
	        } else if (a * b == c) { 
	            System.out.println(a + " * " + b + " = " + c); 
	        } else { 
	            System.out.println("No arithmetic formula found for the given numbers."); 
	        } 
	    } 

}
