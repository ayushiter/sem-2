package Assignment2;
import java.util.*;
class Car {
    // Instance variables for model and year
    String model;
    int year;

    // Method to set the details of the car
    public void setDetails(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display the details of the car
    public void displayDetails() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
    
    public String compareCars(Car otherCar) {
        if (this.year > otherCar.year) {
            return "The first car is newer.";
        } else if (this.year < otherCar.year) {
            return "The second car is newer";
        } else {
            return "Both cars are of the same year.";
        }
    }
}
public class Q1 {
	public static void main(String[] args) {
        // Create the first Car object and initialize its values directly
        Car car1 = new Car();
        car1.model = "Toyota";
        car1.year = 2020;

        // Create the second Car object and accept input for model and year
        Scanner scanner = new Scanner(System.in);
        Car car2 = new Car();
        System.out.println("Enter the model of the second car:");
        String model = scanner.nextLine();
        System.out.println("Enter the year of the second car:");
        int year = scanner.nextInt();
        car2.setDetails(model, year);

        // Display details of both cars
        System.out.println("\nDetails of the first car:");
        car1.displayDetails();
        System.out.println("\nDetails of the second car:");
        car2.displayDetails();

        // Compare which car is newer
        String comparisonResult = car1.compareCars(car2);
        System.out.println("\n" + comparisonResult);
    }

}
