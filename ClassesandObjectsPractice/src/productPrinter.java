
public class productPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product Brush = new Product("Brush", 9.0);
		Brush.reducePrice(5.0);
		Product Computer_Game = new Product("Computer_Game", 35.00);
		Computer_Game.reducePrice(5.0);
		System.out.println(Brush.getCost());
		System.out.println(Computer_Game.getCost());
	}
}
