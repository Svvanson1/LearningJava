
public class person implements Comparable<person>{

	String name;
	int age;
	
	public person(String n, int a) {
		n = name;
		a = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	


	public int compareTo(person o) {
	    int result = name.compareToIgnoreCase(o.name);
	    if(result==0) {
	        return Integer.valueOf(age).compareTo(o.age);
	    }
	    else {
	        return result;
	    }
	}
	
}
