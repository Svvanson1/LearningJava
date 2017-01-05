import java.util.*;

public class Tester {

	public static void main(String[] args) {
		int[][] numArray = new int[4][4];//Creates 4x4 array specified in the project.
		boolean isMagicSquare = false;
		Scanner kbr = new Scanner(System.in); //Scanner to read keyboard input
		
		for(int r = 0; r < numArray.length; r++ ) { //Loop reads rows
        	for(int c = 0 ; c < numArray[0].length; c++) { //Loop reads columns
        		System.out.println("Enter element at Row: " + (r +1) + " Column: " + (c + 1)); //Prints so you know what index you are writing to
        		numArray[r][c] = kbr.nextInt(); //Sets input into array
        	}//End column loop
		}//End row loop
		
		int sum = 0;
		int sum1, sum2;
		
		//Diagonal checker
		for (int diagRow = 0; diagRow < 5; diagRow++) {
			for (int diagColumn = 0; diagColumn < 4; diagColumn++) {
				if (diagRow == diagColumn) {
					sum += numArray[diagRow][diagColumn];
				}//End if
			}//End diagColumn loop
		}//End diagRow loop
		
		//Row checker
		for (int rowRow = 0; rowRow < 4; rowRow++) {
			sum1 = 0;//Resets sum1 so we can try the next row
			for (int rowColumn = 0; rowColumn < 4; rowColumn++) {
				sum1 += numArray[rowRow][rowColumn]; //Adds all elements in row 
			}//End rowColumn loop
			if (sum == sum1) {
				isMagicSquare = true;//This rows sum equals that of the diagonals sum therefore it must be true, so we continue.
			}//End if
			else {
				isMagicSquare = false; //Set boolean
				break; //If the rows added doesn't equal the diagonals added then numArray isn't a magic square therefore end
			}//End Else
		}//End rowRow loop
		
		//Column Checker
		for (int columnRow = 0; columnRow < 4; columnRow++) {
			sum2 = 0;//Resets sum2 so we can try again
			for (int columnColumn = 0; columnColumn < 4; columnColumn++) {
				sum2 += numArray[columnColumn][columnRow];
			}
			if (sum == sum2) { //Sets boolean to true (Columns do match)
				isMagicSquare = true;
			}
			else {//Sets boolean to false (Columns dont match)
				isMagicSquare = false;
				break;
			}
		}//Ends columnRow
		System.out.println(isMagicSquare);
	}// End main

}
