package Assignment2;
import java.util.*;
public class Q3 {
	static class Book {
	    // Instance variables
	    private int bookId;
	    private double price;
	    private int quantity;

	    // Static variable to track the total amount spent on all books
	    public static double totalAmount = 0.0;

	    // Parameterized constructor to initialize the bookId, price, and quantity
	    public Book(int bookId, double price, int quantity) {
	        this.bookId = bookId;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    // Method to display the details of the book
	    public void displayDetails() {
	        System.out.println("Book ID: " + bookId + ", Price: " + price + ", Quantity: " + quantity);
	    }

	    // Method to calculate and return the total cost of the book
	    public double calculateTotalCost() {
	        double totalCost = price * quantity;
	        // Update the static variable totalAmount
	        totalAmount += totalCost;
	        return totalCost;
	    }
	}

	public class Main {
	    public void main(String[] args) {
	        // Create 5 different books and simulate the purchase
	        Book book1 = new Book(101, 250.0, 2);
	        Book book2 = new Book(102, 150.0, 3);
	        Book book3 = new Book(103, 300.0, 1);
	        Book book4 = new Book(104, 120.0, 4);
	        Book book5 = new Book(105, 200.0, 5);

	        // Display details and total cost for each book
	        System.out.println("Details of the books purchased:");

	        System.out.println("\nBook 1:");
	        book1.displayDetails();
	        double totalCost1 = book1.calculateTotalCost();
	        System.out.println("Total cost for this book: " + totalCost1);

	        System.out.println("\nBook 2:");
	        book2.displayDetails();
	        double totalCost2 = book2.calculateTotalCost();
	        System.out.println("Total cost for this book: " + totalCost2);

	        System.out.println("\nBook 3:");
	        book3.displayDetails();
	        double totalCost3 = book3.calculateTotalCost();
	        System.out.println("Total cost for this book: " + totalCost3);

	        System.out.println("\nBook 4:");
	        book4.displayDetails();
	        double totalCost4 = book4.calculateTotalCost();
	        System.out.println("Total cost for this book: " + totalCost4);

	        System.out.println("\nBook 5:");
	        book5.displayDetails();
	        double totalCost5 = book5.calculateTotalCost();
	        System.out.println("Total cost for this book: " + totalCost5);

	        // Display the total amount spent on all books
	        System.out.println("\nTotal amount spent on all books: " + Book.totalAmount);
	    }
	}



}
