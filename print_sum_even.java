package programs;

import java.util.Scanner;

public class print_sum_even {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int sum = 0;
		for(int i = 0; i < n; i+=2) {
			sum += i;
		}
		
		System.out.println("Sum of even numbers till " + n + " is " + sum);

	}

}
