import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
	 public int solution(int number) {
		 int sum = 0;
		    for (int i = 0; i < number; i++) {
		        if (i % 3 == 0 || i % 5 == 0) {
		            sum = sum + i;
		        }//End if 
		    }//End for
		    return sum;
	 }//End method
}//End class
