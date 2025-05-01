package Assignment2;
import java.util.*;
public class Q2 {
	class Complex {
	    // Instance variables for real and imaginary parts of a complex number
	    private int real;
	    private int imag;

	    // Method to set the values for real and imaginary parts
	    public void setData(int real, int imag) {
	        this.real = real;
	        this.imag = imag;
	    }

	    // Method to display the complex number in the format "a + bi"
	    public void display() {
	        if (imag >= 0)
	            System.out.println(real + " + " + imag + "i");
	        else
	            System.out.println(real + " - " + (-imag) + "i");
	    }

	    // Method to add two complex numbers and return the result
	    public Complex add(Complex c1, Complex c2) {
	        Complex result = new Complex();
	        result.real = c1.real + c2.real;  // Adding real parts
	        result.imag = c1.imag + c2.imag;  // Adding imaginary parts
	        return result;
	    }
	}
	public class Main{
	    public void main(String[] args) {
	        // Create two Complex objects
	        Complex complex1 = new Complex();
	        Complex complex2 = new Complex();

	        // Set the values for the first complex number
	        complex1.setData(3, 2);  // 3 + 2i

	        // Set the values for the second complex number
	        complex2.setData(1, 7);  // 1 + 7i

	        // Display the complex numbers
	        System.out.println("First Complex Number: ");
	        complex1.display();

	        System.out.println("Second Complex Number: ");
	        complex2.display();

	        // Add the two complex numbers
	        Complex result = new Complex();
	        result = result.add(complex1, complex2);  // Adding complex1 and complex2

	        // Display the result of the addition
	        System.out.println("Sum of the two Complex Numbers: ");
	        result.display();
	    }
	}
}
