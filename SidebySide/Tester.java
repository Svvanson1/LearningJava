import java.util.Arrays;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss[] = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
		Arrays.sort(ss);
		System.out.println("Ascending:");
		for (int i = 0; i < ss.length; i++){
			System.out.println(ss[i]);
		}
		System.out.println("Descending:");
		for (int j = ss.length-1; j >= 0; j--){
			System.out.println(ss[j]);
		}
	}

}
