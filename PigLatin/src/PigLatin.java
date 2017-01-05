public class PigLatin {
      private String myString;
     
public PigLatin (String s) {
            myString = s;
      }
 
char[] vowels = {'a','e','o','i','u','y'};
 
public String PigLatinify(String word) {
      //Break word into array
      char[] wordArray = word.toCharArray();
      boolean vowelFirst = true;
      String lettersBefore = "";
      for (int i = 0; i < wordArray.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                  if (wordArray[i] == vowels[j] && i==0){
                       
                        System.out.println(word + "yay");
                        return word + "yay";
                        //continue;
                  }
                  if(wordArray[i] == vowels[j] && vowelFirst == false && i>0) {
                             
                              lettersBefore = word.substring(0,i);
                              //System.out.println(word.substring(lettersBefore.length()) + lettersBefore + "ay");
                              vowelFirst = true;
                              return (word.substring(lettersBefore.length()) + lettersBefore + "ay");
                             
                              }
                  if (wordArray[i] != vowels[j] && i < wordArray.length && vowelFirst == true) {
                        vowelFirst = false;
                        continue;
                        }
     
                            
//                else if (wordArray[i] != vowels[j] && i == wordArray.length && consWord){
//                      System.out.println("last else");
//                      System.out.println(word + "yay");
//                      consWord = true;
//                      return word + "yay";
//                      //continue;
//                }
            }
      }
      return "";
} //End method
 
     


	
}
