/*
 *  this: to pass as an argument in the method. 
The this keyword can also be passed as an argument in the method. 
It is mainly used in the event handling. Let's see the example:
 * 
 * */


package practice.java.core.Constructor;

public class ThisPassArgument {

	void m(ThisPassArgument Obj) {
		System.out.println("Printing from m method");
	}
	
	void n() {
		m(this);
	}
	
	public static void main(String[] args) {
		
		ThisPassArgument tpa = new ThisPassArgument();
		tpa.n();
	}

}
