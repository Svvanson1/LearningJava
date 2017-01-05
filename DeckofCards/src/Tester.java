import java.util.ArrayList;

public class Tester {

public static void main(String[] args) {
   // TODO Auto-generated method stub
      ArrayList<Card> x = new ArrayList<Card>();
      
      
         for (int i = 0; i < 53; i++) {
               x.add(new Card(i));
               }//end for loop
      Deck.shuffleDeck(x);
      ArrayList<Card> player1 = Deck.dealCards1(x);
      ArrayList<Card> player2 = Deck.dealCards2(x);
   
      System.out.println(Deck.playWar(player1, player2));
   }

}
