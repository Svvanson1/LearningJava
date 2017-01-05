public class SavingsAccount {
 private double  balance;
 private String name;
 private double interest;
 
public SavingsAccount(double b, double i, String n) {
	balance = b;
	interest = i; 
	name = n;
}
 public void addInterest(double newInterest) {
	 	interest = newInterest;
	 	this.balance = balance * newInterest ;
	}
public String getName() {
	return name;
}
public double getBalance() {
	return balance;
}

 
}
