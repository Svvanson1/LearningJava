import java.util.Scanner;


public class TestPigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyReader = new Scanner(System.in);
		System.out.println("Enter something you would like to Pig-Latinify");
	    String originalString = keyReader.nextLine();
	    
	    PigLatin stringObject = new PigLatin(originalString);
	    System.out.print(stringObject.PigLatinify(originalString));
	    }
	}


