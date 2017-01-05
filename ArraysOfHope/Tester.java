
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alphabet = new char[24];
		int x = 0;
		for (char i = 65; i < 26; i++) {
			alphabet[i] = (char)(65 + x++);
		}
		for (int j = 0; j < alphabet.length; j++) {
			System.out.print(alphabet[j] + ",");
		}
	}
}
