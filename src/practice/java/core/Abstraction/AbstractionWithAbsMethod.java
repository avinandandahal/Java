/*
 * A class that is declared with abstract keyword, is known as abstract class in java. 
 * It can have abstract and non-abstract methods (method with body).
 * Abstraction is a process of hiding the implementation details and showing only functionality to the user.
 * Another way, it shows only important things to the user and hides the internal details for example sending sms,
 *  you just type the text and send the message. You don't know the internal processing about the message delivery.
 *  Abstraction lets you focus on what the object does instead of how it does it.
 *  
 *  Ways to achieve Abstaction:::
 *  There are two ways to achieve abstraction in java
 *  1)	Abstract class (0 to 100%)
 *  2)	Interface (100%)
 */

package practice.java.core.Abstraction;

abstract class Bike{
	abstract void Honda();
}
public class AbstractionWithAbsMethod extends Bike{

	public static void main(String[] args) {

		AbstractionWithAbsMethod aam = new AbstractionWithAbsMethod();
		aam.Honda();

	}

	@Override
	void Honda() {
		System.out.println("Printing from HONDA");		
	}

}
