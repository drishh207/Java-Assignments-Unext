package programs;
import java.util.*;

public class vowels {
	static Scanner scan = new Scanner(System.in);
            void find_vowel_switch(String a){
            	switch(a.charAt(0)){
            		case 'A':
                    case 'a':
                    case 'E':
                    case 'e':
                    case 'I':
                    case 'i':
                    case 'O':
                    case 'o':
                    case 'U':
                    case 'u':System.out.println(a.charAt(0) + " is a vowel");
                             break;
                    default: System.out.println(a.charAt(0) +" is a consonant");

                 }
            }

            void find_vowel_if(String a){
            	char b = a.charAt(0);
                if(b == 'a' || b == 'A' || b == 'e' || b == 'E' || b == 'i' || b == 'I' || b == 'O' || b == 'o' || b == 'u' || b == 'U') {
                	System.out.println(b + " is a vowel");
                 }
                 else{
                    System.out.println(b + " is a consonant");
                 }
            }
            
            public static void main(String[] args) {
            	System.out.println("Enter a character: ");
                String a = scan.nextLine();
                vowels v = new vowels();
                v.find_vowel_switch(a);
                v.find_vowel_if(a);
			}
	}


