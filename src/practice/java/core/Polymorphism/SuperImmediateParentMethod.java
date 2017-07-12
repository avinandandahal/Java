/*
 * Usage of java super Keyword:
		super can be used to refer immediate parent class instance variable.
		super can be used to invoke immediate parent class method.
		super() can be used to invoke immediate parent class constructor.
 */

/*
 * super is used to refer immediate parent class method.
 */

package practice.java.core.Polymorphism;

class Bird{
	void fly() {
		System.out.println("Bird is flying");
	}
}

class Crow extends Bird{
	void fly() {
		System.out.println("Crow is flying");
	}
	void sing() {
		System.out.println("Bird is singing");
	}
	void eat() {
		super.fly();
		this.fly();
		sing();
	}
}

public class SuperImmediateParentMethod {

	public static void main(String[] args) {
		Crow c = new Crow();
		c.eat();

	}

}
