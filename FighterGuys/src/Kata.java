public class Kata {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    // Your code goes here. Have fun!
    int fighter1HP = fighter1.health;
    int fighter2HP = fighter2.health;
    String fighter1Name = fighter1.name;
    String fighter2Name = fighter2.name;
    String winner = "";
    		if (fighter1Name.equals(firstAttacker)) {
    			do {
            fighter2HP -= fighter1.damagePerAttack;
            if (fighter2HP > 0) {
    				fighter1HP -= fighter2.damagePerAttack;
            }
          }
          while (fighter1HP > 0 && fighter2HP > 0);
    }

    		if (fighter2Name.equals(firstAttacker)) {
    			do {
            fighter1HP -= fighter2.damagePerAttack;
            if (fighter1HP > 0) {
    				fighter2HP -= fighter1.damagePerAttack;
            }
          }
          while (fighter1HP > 0 && fighter2HP > 0);
    }

    		if (fighter1HP != 0) {
    			winner = fighter2.name;
    		}
    		else {
    			winner = fighter1.name;
    		}
    		
return winner;
  }
}

