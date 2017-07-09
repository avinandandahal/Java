package practice.java.core.Constructor;

public class ThisCurrentClassInstanceVariable {

	int roll;
	String name;
	float fee;
	
	ThisCurrentClassInstanceVariable(int roll, String name, float fee){
		this.roll = roll;
		this.name = name;
		this.fee = fee;
	}
	
	void diplay(){
		System.out.println(roll + " " + name + " " + fee);
	}
	
	public static void main(String[] args) {
		
		ThisCurrentClassInstanceVariable var1 = new ThisCurrentClassInstanceVariable(1, "avi", 11);
		ThisCurrentClassInstanceVariable var2 = new ThisCurrentClassInstanceVariable(2, "ravi", 12);
		
		var1.diplay();
		var2.diplay();

	}

}
