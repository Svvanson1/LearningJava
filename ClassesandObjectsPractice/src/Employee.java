
public class Employee {
	private String name;
	private double salary;
	 
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}
	public String getName() {
	return name;
	}
	public double getSalary() {
	return salary;	
	}
	public double raiseSalary(double byPercent) {
	double actualPercent = byPercent / 100;
	double moneyAdded = salary * actualPercent;
	double newSalary = salary + moneyAdded;
	return newSalary;
	}
}
