package practice.java.core.Abstraction;

abstract class Shape{
	abstract void circle();
}

//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape{
	@Override
	void circle() {
		System.out.println("Printing from Rectangle");		
	}
	
}

class Square extends Shape{

	@Override
	void circle() {
		System.out.println("Printing from Square");		
	}
	
}

//In real scenario, method is called by programmer or user  
public class AbstractionRealExample {

	public static void main(String[] args) {
		
		Shape s = new Rectangle(); //In real scenario, object is provided through method e.g. getShape() method 
		s.circle();
		
	}

}
