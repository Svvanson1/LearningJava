import java.math.*;
import java.util.Arrays;
public class ArrayMethods
{
	private int[] values;
	public ArrayMethods(int[] newValues) { 
		values = newValues;
		}
	
	
	public void printArray(){
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}//End for loop
	}
	
	public void swapFirstAndLast() {
		int last = values.length;
		int first = values[0];
		values[0] = last;
		values[values.length -1] = first;
	}//End swapFirstAndLast
	public void shiftRight() {
		int takeAway = values[values.length - 1];
		for (int i = values.length - 1; 0 < i; i--) {
				values[i] = values[i-1];
				}//End loop
		values[0] = takeAway;
	}//End shiftRight
	
	public void replaceZero() {
		for (int i = 0; i < values.length; i++) {
			if ((values[i] % 2) == 0) {
				values[i] = 0;
			}//End if Statement
		}//End for loop
	}//End replaceZero method
	
	public void middleNeighbors() {
		int last = values.length - 1;
		for (int i = 0; i < last; i++) {
				if (i - 1 < i + 1) {
					values[i] = values[i+1];
				}//End if
				if(i + 1 < i - 1) {
				values[i] = values[i-1];
				}//End 2nd if 
		}//End for loop
	}//End middleNeighbors
	
	public void oddMiddleRemover() {
			if (values.length % 2 != 0) {
				double halfNum = Math.ceil(values.length/2);
				int num = (int)halfNum;
				values[num] = 0;
			}//End if
			else {
				int num = (values.length/2);
				values[num] = 0;
				values[num-1] = 0;
			}//End else
	}//End oddMiddleRemover
	
	public void evenFirst() {
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < values.length; i++ ) {
			if (values[i] % 2 == 0) {
			for (int j = i; j>count2; j--){
				count = values[j - 1];
				values[j-1] = values[j];
				values[j] = count;
			    }//End 2nd for loop
			count2++;
			}//End if
		}//End 1st for loop
	}//End evenFirst
	
	public int secondBiggest() {
		int largest, secondLargest;
		if (values[0] > values[1]) {
			largest = values[0];
			secondLargest = values[1];
			}//End 1st if
		else {
			largest = values[1];
			secondLargest = values[0];
		}//End else	
		for (int i = 2; i < values.length; i++) {
			if (values[i] > largest) {
			 secondLargest = largest;
			 largest = values[i];
			}//End 2nd if 
			else if (values[i] < largest && values[i] > secondLargest) {
				secondLargest = values[i];
			}//End else if
		}//End for loop
		return secondLargest;
	}//End secondBiggest
	
	public boolean isSorted() {
		boolean isSorted = true;
		int[] sorted = values.clone();
		Arrays.sort(sorted);
			for (int i = 0; i < values.length; i++) {
				int x = values[i];
				int y = sorted[i];
				if (x != y) {
					isSorted = false;
					}//End if
			}//End for loop
		return isSorted;
	}//End isSorted
	
	public boolean adjDupeElements() {
		boolean isAdjDupe = false;
		for (int i = 0; i < values.length -1; i++) {
			if(values[i] == values[i+1]) {
				isAdjDupe = true;
			}
			if(i != 0 && values[i] == values[i-1]) {
				isAdjDupe = true;
			}
		}//End for loop
		return isAdjDupe;
	}//End adjDupeElements
	
	public boolean anyDupeElements() {
		boolean isDupe = false;
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length; j++) {
				if (j != i) {
					if (values[i] == values[j]) {
						isDupe = true;
					}//End 2nd if
				}//End 1st if 
			}//End 2nd for loop 
		}//End 1st for loop
		return isDupe;
	}//End anyDupeElements
	
}//End class
