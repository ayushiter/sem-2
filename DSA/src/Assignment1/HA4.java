package Assignment1;
import java.util.*;
public class HA4 {
	  public static double addMatrix(double a, double b) { 
	        int rows = a.length; 
	        int cols = a.length; 
	        double [][] c = new double[rows][cols]; 
	 
	        for (int i = 0; i < rows; i++) { 
	            for (int j = 0; j < cols; j++) { 
	                c[i][j] = a[i][j] + b[i][j]; 
	            } 
	        } 
	        return c; 
	    } 
	 
	    public static void main(String args) { 
	        Scanner input = new Scanner(System.in); 
	 
	        System.out.print("Enter the number of rows and columns of the matrices: "); 
	        int rows = input.nextInt(); 
	        int cols = input.nextInt(); 
	 
	        double a = new double[rows][cols]; 
	        double b = new double[rows][cols]; 
	 
	        System.out.println("Enter the elements of matrix a: "); 
	        for (int i = 0; i < rows; i++) { 
	            for (int j = 0; j < cols; j++) { 
	                a[i][j] = input.nextDouble(); 
	            } 
	        } 
	 
	        System.out.println("Enter the elements of matrix b: "); 
	        for (int i = 0; i < rows; i++) { 
	            for (int j = 0; j < cols; j++) { 
	                b[i][j] = input.nextDouble(); 
	            } 
	        } 
	 
	        double c = addMatrix(a, b); 
	 
	        System.out.println("The sum of the matrices is: "); 
	        for (int i = 0; i < rows; i++) { 
	            for (int j = 0; j < cols; j++) { 
	                System.out.print(c[i][j] + " "); 
	            } 
	            System.out.println(); 
	        } 
	    } 

}
