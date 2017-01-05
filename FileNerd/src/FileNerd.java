import java.io.*;
import java.util.*;


public class FileNerd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File("D:\\FileNerd\\src\\NerdData.in"));
		int maxIndx = -1;
		String text[] = new String[1000];
		
		while(input.hasNext()) {
			maxIndx++;
			text[maxIndx] = input.nextLine();
		}
		input.close();
		
		for(int i = 0; i<= maxIndx; i++) {
			Scanner input2 = new Scanner(text[i]);
			String firstWord = input2.next();
			if (firstWord.equals("The")) {
				System.out.println(text[i]);
			}
		}
 
		
	}

}
