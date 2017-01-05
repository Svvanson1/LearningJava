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
	    public boolean setName(String name)
	    {
	        this.name = name;
	        return true;
	    }
	    public boolean setBalance(double balance)
	    {
	        this.balance = balance;
	        return true;
	    }
	    public double getBalance()
	    {
	        return this.balance;
	    }
	    public String getName()
	    {
	        return this.name;
	    }
}