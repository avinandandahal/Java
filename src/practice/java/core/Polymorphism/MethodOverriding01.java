/*
 * If subclass (child class) has the same method as declared in the parent class, 
 * it is known as method overriding in java.
 * In other words, If subclass provides the specific implementation of the method that has been provided 
 * by one of its parent class, it is known as method overriding.
 */

package practice.java.core.Polymorphism;

class Vehicle{
	void run() {
		System.out.println("Printing from Vehicle");
	}
}

public class MethodOverriding01 extends Vehicle {

	void run() {
		System.out.println("Printing from Main");
	}
	
	public static void main(String[] args) {
		
		MethodOverriding01 mor = new MethodOverriding01();
		mor.run();

	}

}
