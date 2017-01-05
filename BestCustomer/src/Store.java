import java.util.ArrayList;

public class Store {
		public double amount;
		public String customerName;
		

		public Store(double b, String n) {
			amount = b;
			customerName = n;
		}
		
		ArrayList<Store> names = new ArrayList<Store>();
		
		public void addSale (String customerName, double amount) {
			Store x = new Store(amount, customerName);
			names.add(x);
		}
		
	    public double getMoney()
	    {
	        return this.amount;
	    }
	    public String getName()
	    {
	        return this.customerName;
	    }
	    
		public String nameOfBestCustomer() {
			String best = "none";
			double highestVal = 0;
			
			for (int i = 0; i < names.size(); i++) {
						if (names.get(i).getMoney() > highestVal) {
							best = names.get(i).getName();
							highestVal = names.get(i).getMoney();
						}
			}//End loop
			return best;
		}//End Method
	    
	    
}