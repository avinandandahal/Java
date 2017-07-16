//Real use of #Instanceof in java

package practice.java.core.Polymorphism;

interface Printable{
	
}

class A1 implements Printable{
	void a() {
		System.out.println("Printing from A");
	}
}

class B1 implements Printable{
	void b() {
		System.out.println("Printing from B");
	}
}

class Calling{
	void invoke(Printable p) {
		if(p instanceof A1) {
			A1 a = (A1)p;		//Downcasting
			a.a();
		}
		if(p instanceof B1) {
			B1 b = (B1)p;		//Downcasting
			b.b();
		}
	}
}//end of Call class 

public class InstanceOfExample {

	public static void main(String[] args) {
		Printable p = new B1();  
		Calling c=new Calling();  
		c.invoke(p);  

	}

}
