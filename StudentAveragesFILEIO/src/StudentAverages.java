import java.io.*;
import java.util.*;

public class StudentAverages {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("D:\\StudentAveragesFILEIO\\src\\StudentScores.in")); //Creates Scanner object that Reads file
		int maxIndx = -1;
		int g = 0;
		int count = 0;
		String text2[] = new String[100];
		while(input.hasNext()) {
			maxIndx++; //increments max index
			text2[maxIndx] = input.nextLine(); //Breaks total text2 by line when the index of text2 is at it's maximum
		}
		input.close(); //Closes file
		FileWriter writer = new FileWriter("D:\\StudentAveragesFILEIO\\src\\StudentScores.out");
		PrintWriter output = new PrintWriter(writer);
		for (int i = 0; i < maxIndx + 1; i++) {
			System.out.println(text2[i]); //Prints the original input 
			String name = text2[i].replaceAll("[0-9]", ""); //Creates the name String which contains only letters
			text2[i] = text2[i].toUpperCase();
			text2[i] = text2[i].replaceAll("[A-Z]", ""); //Gets rid of Alphabetic that causes nextInt not to work
			Scanner input2 = new Scanner(text2[i]); //Scanner for reading from text2 array
			while(input2.hasNextInt()) { //Loops through until there are no more integers
				g += input2.nextInt(); //Adds all scores
				count++; //Adds number of scores
			}
			System.out.println("Average " + g/count);
			output.println(name);
			output.println("Average " + g/count); //Outputs average to file
			g = 0; 	   // Resets everything
			count = 0; // 
		}
		output.close();
		writer.close();
		}
	}

