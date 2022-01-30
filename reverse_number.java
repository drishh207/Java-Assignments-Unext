package programs;

import java.util.Scanner;

public class reverse_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int reverse = 0;
		while(n > 0) {
			int temp = n%10;
			reverse = reverse * 10 + temp;
			n = n/10;
		}
		System.out.println("The reverse is " + reverse);

	}
	
}
