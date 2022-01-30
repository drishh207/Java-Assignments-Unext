package programs;
import java.util.*;

public class max_no {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a > b && a > c) {
			System.out.println(a+ "  is the maximum number");
		}
		else if(b > c){
			System.out.println(b + " is the maximum number");
		}
		else {
			System.out.println(c + " is the maximum number");
		}
	}

}
