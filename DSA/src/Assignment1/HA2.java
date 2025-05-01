package Assignment1;
import java.util.*;
public class HA2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in); 
	        ArrayList<String> lines = new ArrayList<>(); 
	 
	        System.out.println("Enter lines of text (enter an empty line to finish):"); 
	        String line; 
	        while (!(line = input.nextLine()).isEmpty()) { 
	            lines.add(line); 
	        } 
	 
	        System.out.println("\nLines in reversed order:"); 
	        for (int i = lines.size() - 1; i >= 0; i--) { 
	            System.out.println(lines.get(i)); 
	        } 
	    } 

}
