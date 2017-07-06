package practice.java.core.Constructor;

public class StaticVariable {

	int roll;
	String name;
	static String college = "United";
	
	StaticVariable(int r, String n){
		roll = r;
		name = n;
	}
	
	void display() {
		System.out.println(roll+" "+ name +" "+ college);
	}
	
	public static void main(String[] args) {
		
		StaticVariable sv1 = new StaticVariable(1001, "Ravi");
		StaticVariable sv2 = new StaticVariable(1002, "Ram");
		
		sv1.display();
		sv2.display();

	}

}
