
public class Product {
	private String productName;
	private double cost;
	 
	public Product(String n, double c) {
		productName = n;
		cost = c;
	}
	public String getName() {
	return productName;
	}
	public double getCost() {
	return cost;	
	}
	public double reducePrice(double Amount) {
	double newPrice = cost - Amount;
	return newPrice;
	}
}
