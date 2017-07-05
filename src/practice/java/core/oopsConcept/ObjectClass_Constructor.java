package practice.java.core.oopsConcept;

public class ObjectClass_Constructor {

	int id;
	String name;
	
	ObjectClass_Constructor(int i, String n){
		id = i;
		name = n;
	}
	
	void displayName(){
		System.out.println("ID:"+ id + " Name:" + name);
	}
	
	public static void main(String[] args) {

		ObjectClass_Constructor Oops1 = new ObjectClass_Constructor(1, "avi");
		ObjectClass_Constructor Oops2 = new ObjectClass_Constructor(2, "ravi");
		
		Oops1.displayName();
		Oops2.displayName();

	}

}
