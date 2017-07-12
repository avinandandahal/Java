package practice.java.core.Polymorphism;

class A{
	A get(){
		return this;
	}
}


public class ThisReturnType_Covarient extends A {

	ThisReturnType_Covarient get() {
		return this;
	}
	
	void message(){
		System.out.println("Printing from  message");
	}
	
	public static void main(String[] args) {

		new ThisReturnType_Covarient().get().message();

	}

}
