/*
 * Usage of java super Keyword:
		super can be used to refer immediate parent class instance variable.
		super can be used to invoke immediate parent class method.
		super() can be used to invoke immediate parent class constructor.
 */

/*
 * super is used to refer immediate parent class instance variable.
 */

package practice.java.core.Polymorphism;

class Human{
	Human(){
		System.out.println("Printing from human constructor");
	}
}

class Man extends Human{
	Man(){
		super();
		System.out.println("Printing from Man constructor");
	}
}

public class SuperImmediateConstructor {

	public static void main(String[] args) {
		
		Man m = new Man();
		

	}

}
