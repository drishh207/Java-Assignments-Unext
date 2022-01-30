package programs;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		
		int count = 0;
		if(n == 0 || n == 1) {
			System.out.println("The number is not a prime number");
		}
		else {
			for(int i = 2; i <= n/2; i++) {
				if(n%i == 0) {
					System.out.println("The number is not a prime number");
					count++;
					break;
				}
			}
			
			if(count == 0) {
				System.out.println("The number is a prime number");
			}
		}

	}

}
