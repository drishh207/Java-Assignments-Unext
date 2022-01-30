package programs;
import java.util.*;
public class swap_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 1; i <= n; i++){
        	arr[i-1] = i;
        }
        System.out.println("Original Array");

        for(int i: arr){
        	System.out.print(i + " ");
        }
        
        for(int i = 0; i < n-2; i+=2){
        	int temp;
        	temp = arr[i];
        	arr[i] = arr[i+1];
        	arr[i+1] = temp;

        }
        
        System.out.println("");
        System.out.println("Reverse Array");
        for(int i: arr){
        	System.out.print(i + " ");
        }
	}
}
