package Assignment2;
import java.util.*;
public class Q4 {
	class Deposit {
	    // Instance variables
	    long principal;
	    int time;
	    double rate;
	    double total_amt;

	    // Constructor 1: Default constructor (No arguments)
	    public Deposit() {
	        this.principal = 0;
	        this.time = 0;
	        this.rate = 0.0;
	        this.total_amt = 0.0;
	    }

	    // Constructor 2: Parameterized constructor with (long, int, double)
	    public Deposit(long principal, int time, double rate) {
	        this.principal = principal;
	        this.time = time;
	        this.rate = rate;
	        this.total_amt = 0.0;  // Initially set to 0
	    }

	    // Constructor 3: Parameterized constructor with (long, int)
	    public Deposit(long principal, int time) {
	        this.principal = principal;
	        this.time = time;
	        this.rate = 5.0;  // Default rate is set to 5%
	        this.total_amt = 0.0;  // Initially set to 0
	    }

	    // Constructor 4: Parameterized constructor with (long, double)
	    public Deposit(long principal, double rate) {
	        this.principal = principal;
	        this.time = 1;  // Default time is set to 1 year
	        this.rate = rate;
	        this.total_amt = 0.0;  // Initially set to 0
	    }

	    // Method to calculate total amount
	    public void calc_amt() {
	        total_amt = principal + (principal * rate * time) / 100;
	    }

	    // Method to display instance variables
	    public void display() {
	        System.out.println("Principal: " + principal);
	        System.out.println("Time: " + time + " years");
	        System.out.println("Rate: " + rate + "%");
	        System.out.println("Total Amount: " + total_amt);
	    }
	}

	public class Main {
	    public void main(String[] args) {
	        // Create Deposit objects using different constructors
	        Deposit deposit1 = new Deposit(); // Using Constructor 1
	        Deposit deposit2 = new Deposit(10000, 5, 7.5); // Using Constructor 2
	        Deposit deposit3 = new Deposit(15000, 3); // Using Constructor 3
	        Deposit deposit4 = new Deposit(20000, 6.0); // Using Constructor 4

	        // Calculate total amount for each deposit
	        deposit2.calc_amt();
	        deposit3.calc_amt();
	        deposit4.calc_amt();

	        // Display details of each deposit
	        System.out.println("Deposit 1 (Default Constructor): ");
	        deposit1.display();

	        System.out.println("\nDeposit 2 (Constructor with Principal, Time, Rate): ");
	        deposit2.display();

	        System.out.println("\nDeposit 3 (Constructor with Principal, Time): ");
	        deposit3.display();

	        System.out.println("\nDeposit 4 (Constructor with Principal, Rate): ");
	        deposit4.display();
	    }
	}



}
