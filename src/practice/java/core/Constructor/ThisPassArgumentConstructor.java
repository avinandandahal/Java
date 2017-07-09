/*
 * this: to pass as argument in the constructor call
 * We can pass the this keyword in the constructor also. 
 * It is useful if we have to use one object in multiple classes.
 */

package practice.java.core.Constructor;

class B{
	ThisPassArgumentConstructor obj;
	
	B(ThisPassArgumentConstructor obj){
		this.obj = obj;
	}
	
	void display() {
		System.out.println(obj.data);
	}
}

public class ThisPassArgumentConstructor {	
	
	int data=10;
	
	ThisPassArgumentConstructor(){
		B b = new B(this);
		b.display();
	}
	
	public static void main(String[] args) {
		ThisPassArgumentConstructor pac = new ThisPassArgumentConstructor();
	}

}


