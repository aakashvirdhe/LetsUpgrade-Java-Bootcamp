// Create a program to Swap Two Numbers

import java.util.*;
public class swap_numbers {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter two numbers to swap :");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = b;
		b = a;
		a = c;
		System.out.println("Swapped numbers are: "+a+ " & "+b);
		in.close();
	}
}
