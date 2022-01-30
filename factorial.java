package programs;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int n1 = n;
		int i = 0, fact = 1;
		while(n != 0) {
			fact = fact * n;
			n--;
		}
		
		System.out.println("The factorial of " + n1 + " is " + fact);

	}

}
