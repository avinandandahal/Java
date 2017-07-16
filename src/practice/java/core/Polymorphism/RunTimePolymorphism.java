package practice.java.core.Polymorphism;

class ParentClass{
	void run() {
		System.out.println("Parent is Printing");
	}
}
public class RunTimePolymorphism extends ParentClass{

	void run() {
		System.out.println("Printing from RunTime Polymorphism");
	}
	
	public static void main(String[] args) {
		
		ParentClass pc = new RunTimePolymorphism();
		pc.run();

	}

}
