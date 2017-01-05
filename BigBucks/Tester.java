import java.util.*;
public class Tester {

	public static void main(String[] args) {
		boolean keepGoing = true;
		List<BankAccount> BankAccounts = new ArrayList<BankAccount>();
		
		//Writes and creates parts of array list.
		while(keepGoing)	{
		Scanner kbr1 = new Scanner(System.in);
		System.out.println("Please enter the name to whom the account belongs (exit to abort): ");
		String input = kbr1.next();
		
		if (input.equals("exit")) {
			keepGoing = false;
			break;
			}//End if
		else {
			Scanner kbr2 = new Scanner(System.in);
			System.out.println("What number would you like to enter? : ");
			double bal = kbr2.nextDouble();
			BankAccounts.add(new BankAccount(bal, input));
		}//End Else
		
		//Finds the biggest account name and balance after the total account size is greater than 4
		if (BankAccounts.size() == 4) {
			double highestBalance = 0;
			String name = "";
			for (int i = 0; i < 4; i++) {
					if (BankAccounts.get(i).getBalance() > highestBalance) {
						highestBalance = BankAccounts.get(i).getBalance();
						name = BankAccounts.get(i).getName();
					}//End 2nd if
				}//End For loop
			System.out.println("The person with the largest balance is: " + name);
			System.out.println("The amount is $" + highestBalance);
			}//End 1st if
		}//End while
		
	}//End main
}//End class
