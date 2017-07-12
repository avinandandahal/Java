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

class Animal{
	String color = "white";
}

class Dog extends Animal{
	String color = "Black";
	
	void display() {
		System.out.println(color);
		System.out.println(super.color);
		System.out.println(this.color);
	}
	
}

public class SuperImmediateParent {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.display();

	}

}
