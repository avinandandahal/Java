package practice.java.core.Constructor;

public class parameterizedConstructor {
		
	int id;
	String name;

	parameterizedConstructor(int i, String n) {
		id = i;
		name = n;
	}
	
	void display(){
		System.out.println("ID:" + id + " Name:" + name);		
	}
	
	public static void main(String[] args) {
		
		parameterizedConstructor pc1 = new parameterizedConstructor(1,"Avi");
		parameterizedConstructor pc2 = new parameterizedConstructor(2,"Ravi");
		
		pc1.display();
		pc2.display();

	}

}
