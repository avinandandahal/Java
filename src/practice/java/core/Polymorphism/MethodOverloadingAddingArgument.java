package practice.java.core.Polymorphism;

class Adder{
	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
}

public class MethodOverloadingAddingArgument {

	public static void main(String[] args) {
		int add2 = Adder.add(1,2);
		int add3 = Adder.add(1, 2, 3);
		
		System.out.println(add2);
		System.out.println(add3);
	}

}
