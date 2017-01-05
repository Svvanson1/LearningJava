import java.util.Scanner;


public class Tester {
	public static boolean isPalindrome(String input) {
		if (input.length() == 0 || input.length() == 1) { //Checks if input is zero or one letter word
			return true; //Return true if nothing or a one letter word is in the input
		}
		if (input.charAt(0) == input.charAt(input.length()-1)) { //Checks 
			return isPalindrome(input.substring(1, input.length()-1)); //Applies the method recursively on the input minus checked chars 
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner src1 = new Scanner(System.in);
		System.out.println("What word would you like to test for palindrome?");
		String input = src1.nextLine();
		
		if (isPalindrome(input)) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}

}
