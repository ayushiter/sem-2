package Assignment2;
import java.util.*;
public class Q5 {
	abstract class Shape {
		abstract double calculateArea();
	}
	class Square extends Shape {
		double side;
		public Square(double side) {
			this.side = side;
		}
		double calculateArea() {
			return side * side;
			
		}
	}
	class Triangle extends Shape {
		double base , height;
		public Triangle(double base , double height) {
			this.base = base ;
			this.height = height;
		}
		double calculateArea() {
			return 0.5 * base * height ;
		}
		
	}
}
                            