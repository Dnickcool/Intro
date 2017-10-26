package basics1;

import java.util.Scanner;

public class ToUpperCase {
	public static void main(String[] args) {
		System.out.println("Enter your name in lower case");
		String name = new Scanner(System.in).nextLine();

		System.out.println("Your name in uppercase is" + name.toUpperCase());

	}
}
