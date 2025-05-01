package Assignment1;
import java.util.*;
public class HA5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random random = new Random(); 
	        int [][] matrix = new int [4][4]; 
	 
	        // Fill the matrix with random 0s and 1s 
	        for (int i = 0; i < 4; i++) { 
	            for (int j = 0; j < 4; j++) { 
	                matrix[i][j] = random.nextInt(2); // Generates 0 or 1 
	            } 
	        } 
	 
	        // Print the matrix 
	        System.out.println("The matrix is: "); 
	        for (int i = 0; i < 4; i++) { 
	            for (int j = 0; j < 4; j++) { 
	                System.out.print(matrix[i][j] + " "); 
	            } 
	            System.out.println(); 
	        } 
	 
	        // Find the first row with the most 1s 
	        int maxRowOnes = 0; 
	        int maxRowIndex = 0; 
	        for (int i = 0; i < 4; i++) { 
	            int rowOnes = 0; 
	            for (int j = 0; j < 4; j++) { 
	                if (matrix[i][j] == 1) { 
	                    rowOnes++; 
	                } 
	            } 
	            if (rowOnes > maxRowOnes) { 
	                maxRowOnes = rowOnes; 
	                maxRowIndex = i; 
	            } 
	        } 
	 
	        // Find the first column with the most 1s 
	        int maxColOnes = 0; 
	        int maxColIndex = 0; 
	        for (int j = 0; j < 4; j++) { 
	            int colOnes = 0; 
	            for (int i = 0; i < 4; i++) { 
	                if (matrix[i][j] == 1) { 
	                    colOnes++; 
	                } 
	            } 
	            if (colOnes > maxColOnes) { 
	                maxColOnes = colOnes; 
	                maxColIndex = j; 
	            } 
	        } 
	 
	        System.out.println("The largest row index: " + maxRowIndex); 
	        System.out.println("The largest column index: " + 
	maxColIndex); 
	    } 

}
