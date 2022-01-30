package programs;

import java.util.Scanner;

public class reverse_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 1; i <= n; i++){
			arr[i-1] = i;
		}
		
		int[] arr1 = new int[n];
		for(int i = 0, j = n-1; i < n; i++, j--) {
			arr1[i] = arr[j];
		}
		
		System.out.println("Original array");
		for(int a:arr) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		System.out.println("Reverse array");
		for(int a:arr1) {
			System.out.print(a + " ");
		}
		
	}

}
