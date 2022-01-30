package programs;

import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
         System.out.println("Enter 2 numbers: ");
         int a = scan.nextInt();
         int b = scan.nextInt();
         System.out.println("Before swapping: a = " + a + " b = " + b);
         int temp = a;
         a = b;
         b = temp;
         System.out.println("Before swapping: a = " + a + " b = " + b);

	}

}
