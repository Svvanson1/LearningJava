
public class SavingsAccountTester {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount myAccount = new SavingsAccount(1000, 0, "Ben");
		myAccount.addInterest(1.10);
		System.out.println(myAccount.getBalance());
	}
}
