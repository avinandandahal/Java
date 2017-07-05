//Example of default constructor that displays the default values

package practice.java.core.Constructor;

public class defaultConstructor_02 {

	int id;
	String name;
	
	void display() {
		System.out.println("ID:" + id + " Name:" + name);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defaultConstructor_02 dc = new defaultConstructor_02();
		dc.display();

	}

}
