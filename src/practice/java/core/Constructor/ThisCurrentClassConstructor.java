package practice.java.core.Constructor;

public class ThisCurrentClassConstructor {

	int roll;
	String name, major;
	float fee;
	int salary;
	
	ThisCurrentClassConstructor(int roll, String name, String major){
		this.roll = roll;
		this.name = name;
		this.major = major;
	}
	
	ThisCurrentClassConstructor(int roll, String name, String major, float fee, int salary){		
		this(roll, name, major);
		this.fee = fee;
		this.salary = salary;
	}
	
	void display() {
		System.out.println(roll +" " + name +" "+ major +" "+ fee +" "+ salary);
	}
	
		
	public static void main(String[] args) {
		
		ThisCurrentClassConstructor ccc1 = new ThisCurrentClassConstructor(01, "avi", "science");
		ThisCurrentClassConstructor ccc2 = new ThisCurrentClassConstructor(02, "ravi", "Physics", 1000, 2000);
		
		ccc1.display();
		ccc2.display();
	}

}
