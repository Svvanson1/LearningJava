public class MatrixMult {
	int a[][] = { {1,2,-2,0}, //creates array a
			{-3,4,7,2},
			{6,0,3,1} }; 
	int b[][] = { {-1,3}, //creates array b
				{0,9},
				{1,-11},
				{4,-5} };

public static int[][] ArrayMultiply(int[][] a, int[][] b) { //Add in return  when it works
	int aRows = a.length;
    int aColumns = a[0].length;
    int bRows = b.length;
    int bColumns = b[0].length;
    if (aColumns != bRows) { //If the matrix algebra is illegal don't do anything
    return null;	
    }
	int[][] cAr = new int[aRows][bColumns]; //a.length = number of rows in a = c rows
	//b[0].length = number of columns in b = number of columns in c
		for (int r = 0; r < aRows; r++) { //Loops through for each row
			for (int c = 0; c < bColumns; c++) { //Loops through for each column
				for (int i = 0; i < aColumns; i++) { //Loops through for given amount of rows 
					cAr[r][c] += a[r][i] * b[i][c]; //Matrix algebra algorithm 
					 
				}//End multiplication loop
			}//End column loop
	}//End row loop	
	return cAr;//Returns the calculated array.
	}//End method
}//End class