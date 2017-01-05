import java.util.ArrayList;
public class Solutions {

  public int solution(int number) {
    //TODO: Code stuff here
  int sum = 0;
 ArrayList<Integer> multiples = new ArrayList<Integer>();
  
  //number checker and arraylist writer
  for (int i = number; i > 0; i--) {
    if ((i % 5) == 0)  {
      multiples.add(i);
      }//End if 
    if ((i % 3) == 0)  {
      multiples.add(i);
    	}//End if
    }//End for loop
  
  //Remove duplicates
  for (int n = 0; n < multiples.size(); n++) {
	  for (int x = multiples.size() - 1; x > 0; x--) {
		  while (n != x) {
	  if (multiples.get(n) == multiples.get(x)) {
		  multiples.remove(n);
	  		 }//End if
		  }//End while
	  }//End second for loop  
	  sum += multiples.get(n);
  }//End first for loop
	  
   return sum; 
  }//End method
}//End class