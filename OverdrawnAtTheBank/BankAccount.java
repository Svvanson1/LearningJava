
public class BankAccount {
		public double balance;
		public String name;

		public BankAccount(double b, String n) {
			balance = b;
			name = n;
		}
		public void Deposit(double depositedMoney){
			balance = balance + depositedMoney;
		}
		public void Withdraw(double withdrawMoney) {
			balance = balance - withdrawMoney;
	    }
}
