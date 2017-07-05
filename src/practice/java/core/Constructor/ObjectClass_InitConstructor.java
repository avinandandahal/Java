package practice.java.core.Constructor;

public class ObjectClass_InitConstructor {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.insert(01, "A", 1001);
		e2.insert(02, "B", 1002);
		e3.insert(03, "C", 1003);
		
		e1.display();
		e2.display();
		e3.display();

	}

}

class Employee{
	
	int eid;
	String name;
	float salary;
	
	void insert(int id, String n, float sal) {
		eid = id;
		name = n;
		salary = sal;
		
	}
	
	void display() {
	
		System.out.println("Eid: "+ eid + " name:" + name + " salary:" + salary );
	}
	
}