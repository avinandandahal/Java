/*
 * If subclass (child class) has the same method as declared in the parent class, 
 * it is known as method overriding in java.
 * In other words, If subclass provides the specific implementation of the method that has been provided 
 * by one of its parent class, it is known as method overriding.
 */

package practice.java.core.Polymorphism;

class Bank{
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank{
	int getRateOfInterest() {
		return 2;
	}
}

class NIBL extends Bank{
	int getRateOfInterest() {
		return 3;
	}
}

public class MethodOverriding02 {

	public static void main(String[] args) {
		Bank b = new Bank();
		SBI sbi = new SBI();
		NIBL nibl = new NIBL();
		
		int b1 = b.getRateOfInterest();
		int b2 = sbi.getRateOfInterest();
		int b3 = nibl.getRateOfInterest();
		
		System.out.println(b1);		
		System.out.println(b2);
		System.out.println(b3);
	}

}
