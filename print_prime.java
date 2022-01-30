package programs;

import java.util.Scanner;

public class print_prime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		
		System.out.println("Prime numbers in range 2 to " + n + " are");
		
		for(int j = 2; j < n; j++) {
			int count = 0;
			for(int i = 2; i <= j/2; i++) {
				if(j%i == 0) {
					count++;
					break;
				}
			}
			
			if(count == 0) {
				System.out.print(j + " ");
			}
		}
	}

}
