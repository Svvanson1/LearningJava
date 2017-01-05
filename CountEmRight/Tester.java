import java.util.Scanner;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean looper = true;
		
		do {
			Scanner keyReader = new Scanner(System.in);
			System.out.println("Enter string: ");
			String originalString = keyReader.nextLine();
	    
			String lowered = originalString.toLowerCase() + "h";
			String sp[] = lowered.split("([s]\\s+[a])|(sa)");
				
				//His initals are SA
				//Sad but true, their teams are better.
				//S   a  sa ssa   s    a
			
			int spLength = (sp.length-1);
			
			System.out.println("There are " + spLength + " occurances");
		
		if (lowered.equals("exit")) 
		{
			looper = false;
		}
}
		while (looper == true);
	}
		}

	

