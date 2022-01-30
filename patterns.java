package programs;

import java.util.Scanner;

public class patterns {
	void pattern1(int n) {
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	void pattern2(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(n);
			}
			System.out.println();
		}
	}
	
	void pattern3(int n) {
		for(int i = 1; i <= n; i++) {
			for(int k = n; k >= i; k--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		patterns p = new patterns();
		System.out.println("--------------------Pattern1---------------------");
		p.pattern1(n);
		System.out.println("--------------------Pattern2---------------------");
		p.pattern2(n);
		System.out.println("--------------------Pattern3---------------------");
		p.pattern3(n);
	}

}
