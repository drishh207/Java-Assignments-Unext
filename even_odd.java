package programs;
import java.util.*;

public class even_odd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		if(n%2 == 0) {
			System.out.println(n + " is an even number");
		}
		else {
			System.out.println(n + " is a odd number");
		}
	}

}
