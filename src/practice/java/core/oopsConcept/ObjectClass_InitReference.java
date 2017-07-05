/*
 * 3 Ways to initialize object
 *  a) By reference variable
 *	b) By method
 *	c) By constructor * 
 * */

package practice.java.core.oopsConcept;

public class ObjectClass_InitReference {

	public static void main(String[] args) {
		
		ObjectClass_Outside Oops = new ObjectClass_Outside();
		Oops.name = "Alex";
		Oops.roll = 29;
		System.out.println(Oops.name +" & "+ Oops.roll);
	}

}

class ObjectClass_Outside{
	int roll;
	String name;
	
}