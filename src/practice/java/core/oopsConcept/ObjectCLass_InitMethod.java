/*
 * 3 Ways to initialize object
 *  a) By reference variable
 *	b) By method
 *	c) By constructor * 
 * */

package practice.java.core.oopsConcept;

public class ObjectCLass_InitMethod {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.insertRecord(15, "ABC");
		s2.insertRecord(11, "XYZ");
		
		s1.display();
		s2.display();

	}

}

class Student{
	
	int roll;
	String name;
	
	void insertRecord(int r, String n) {
		roll = r;
		name = n;
	}
	
	void display(){
		System.out.println(roll +" & " + name);
	}
}
