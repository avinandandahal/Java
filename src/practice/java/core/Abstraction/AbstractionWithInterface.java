/*
 * Rule: If you are extending any abstract class that have abstract method,
 *							you must either provide the implementation of the method or make this class abstract.
 *
 *The abstract class can also be used to provide some implementation of the interface. 
 * In such case, the end user may not be forced to override all the methods of the interface.
 */


package practice.java.core.Abstraction;

interface A{
	void a();
	void b();
	void c();
	void d();
}

abstract class B implements A{
	public void c() {
		System.out.println("printing from C");
	}
}

class M extends B{

	public void a() {
		System.out.println("Printing from A");
	}	
	
	public void b() {
		System.out.println("Printing from B");
	}
	
	public void d() {
		System.out.println("Printing from D");
	}
}

public class AbstractionWithInterface {

	public static void main(String[] args) {
		A a = new M();
		a.a();
		a.b();
		a.c();
	}

}
