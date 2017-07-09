package practice.java.core.Constructor;

class A{
	A getA() {
		return this;
	}
	
	void msg() {
		System.out.println("Printing out from message");
	}
}

public class ThisReturnClassInstance {

	public static void main(String[] args) {
		new A().getA().msg();

	}

}
