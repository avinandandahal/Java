package practice.java.core.Constructor;

public class StaticMethod {

	int roll;
	String name;
	static String college = "United";
	
	StaticMethod(int r, String n){		
		roll = r;
		name = n;
	}
	
	static void change() {
		college = "Tech";
	}
	
	void display() {
		System.out.println(roll+name+college);
	}
	
	public static void main(String[] args) {

		StaticMethod.change();
		
		StaticMethod sm1 = new StaticMethod(1, "Ram");
		StaticMethod sm2 = new StaticMethod(2, "Sam");
		StaticMethod sm3 = new StaticMethod(3, "Dam");
		
		sm1.display();
		sm2.display();
		sm3.display();
		

	}

}
