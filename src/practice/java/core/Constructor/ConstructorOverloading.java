package practice.java.core.Constructor;

public class ConstructorOverloading {

	int id;
	String name;
	int salary;

	ConstructorOverloading(int i, String n) {

		id = i;
		name = n;
	}

	ConstructorOverloading(int i, String n, int s) {

		id = i;
		name = n;
		salary = s;
	}
	
	void display() {
		System.out.println(id+name+salary);
	}

	public static void main(String[] args) {
		
		ConstructorOverloading constOver1 = new ConstructorOverloading(1, "Avi");
		ConstructorOverloading constOver2 = new ConstructorOverloading(2, "Ravi", 2000);
		
		constOver1.display();
		constOver2.display();

	}

}
