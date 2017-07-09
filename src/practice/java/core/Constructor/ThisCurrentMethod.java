package practice.java.core.Constructor;

public class ThisCurrentMethod {

	void firstMethod(){
		System.out.println("Printing from First Method");
	}
	
	void secondMethod() {
		System.out.println("Printing from Second Method");
		this.firstMethod();
	}
	
	
	public static void main(String[] args) {

		ThisCurrentMethod cm = new ThisCurrentMethod();
		cm.secondMethod();

	}

}
