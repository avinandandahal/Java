/*
 * Super Keyword Real life example
 */
package practice.java.core.Polymorphism;

class Person{
	int id;
	String name;
	
	Person(int id, String name){
		this.id = id;
		this.name = name;
	}
}

class Employee extends Person{
	int salary;
	Employee(int id, String name, int salary){
		super(id, name);
		this.salary = salary;
	}
	
	void display(){
		System.out.println(id + " " + name + " " + salary + " ");
	}
}
public class SuperRealExample {

	public static void main(String[] args) {
		Employee e = new Employee(10, "Avi", 10000);
		e.display();
		

	}

}
