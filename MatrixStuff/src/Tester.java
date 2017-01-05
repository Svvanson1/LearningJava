
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixMult matrix = new MatrixMult();
		int[][]answer = MatrixMult.ArrayMultiply(matrix.a, matrix.b);

        for (int r = 0; r < answer.length; r++) {
            for (int c = 0; c < answer[0].length; c++)
            System.out.print(answer[r][c] + " ");
            System.out.println();
        }
		
	}//End main method
}//End class
