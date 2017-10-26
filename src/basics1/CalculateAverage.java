package basics1;

import java.util.Scanner;

public class CalculateAverage {

	

	static class  Average
	{
	    private static Scanner input;

		public static void main(String[] args) {
	        System.out.println("Enter 5 numbers:");
	        input = new Scanner(System.in);

	        int a,b,c,d,e;

	        double avg;

	        a=input.nextInt(1);
	        b=input.nextInt(2);
	        c=input.nextInt(3);
	        d=input.nextInt(4);
	        e=input.nextInt(5);
	        avg=(a+b+c+d+e)/5.0;
	        System.out.println("Largest Number is: "+avg);
	    }
	}
}