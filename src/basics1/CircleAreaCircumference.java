package basics1;

import java.util.Scanner;

public class CircleAreaCircumference {

public static void main(String[] args) {
	
	System.out.println("{Please enter radius: 3.14");
	double radius = extracted().nextDouble();
	
	System.out.println("The area is" + calculateArea(radius));
	System.out.println("The circumference is" + calculateCircumference(radius));
	
}
private static Scanner extracted() {
	return new Scanner(System.in);
}
	private static String calculateArea(double radius) {
	// TODO Auto-generated method stub
	return null;
}
	static double calculateCircumference(double radius) {
		
		return 2* Math.PI* radius;
		
}
	}
