import java.util.*;
public class Encrypter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
			//Generates the [A] matrix
			//Scanner input = new Scanner(System.in);
		    //int[] key = new int[9];
		    //Loops through and allows user to Input key as an array
			    //for (int i = 0; i < key.length; i++)
			    //{
			        //System.out.println("Please enter " + i +" for key");
			        //key[i] = input.nextInt();
			    //}
		    //Asks user for the string the would like to encrypt
		    Scanner keyReader = new Scanner(System.in);
			System.out.println("Enter string that you would like to encrypt: ");
			String originalString = keyReader.nextLine();
			
			//Converts inputted string to lower case, then breaks this into an array
				String lowered = originalString.toLowerCase();
				char[] loweredArray = lowered.toCharArray();
				
		//Gets the numeric value at
		for (int n = 0; n < loweredArray.length; n++) 
		{	
			//Outputs the true value of the character at n'th index (0-26)
			int x = Character.getNumericValue(loweredArray[n])-9;

		
		}
	}
}
