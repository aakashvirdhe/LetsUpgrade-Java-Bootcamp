// Write a program to add sum of all natural number from 1 to 50

import java.util.*;
public class sum_all_natural_num {
	
	public static int sumofn(int last_num) {
		int num = 0;
		for(int i= 1;i<=last_num;i++) {
			num = num + i;
		}
		return num;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter upto which number you want to add:");
		int last_num = in.nextInt();
		System.out.println("Sum is: "+sumofn(last_num));
		in.close();
	}
}
