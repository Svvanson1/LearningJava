import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws IOException {

		ArrayList<person> persons = new ArrayList<person>();
		Scanner file = new Scanner(new File("E:\\MultipleKeySorting\\src\\names.in"));
		
		while (file.hasNextLine()) {
			String n = file.next();
			int a = file.nextInt();
			person person1 = new person(n, a);
			persons.add(person1);
			n = null;
			a = 0;
			file.nextLine();
			}
		
		file.close();
		Collections.sort(persons);
	}

}
