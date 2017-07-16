package practice.java.core.Polymorphism;

class Shape{
	void display() {
		System.out.println("Printing from Shape");
	}
}

class Rectangle extends Shape{
	void display() {
		System.out.println("Printing from Rectangle");
	}
}

class Triangle extends Shape{
	void display() {
		System.out.println("Printing from Triangle");
	}
}

class Circle extends Shape{
	void display() {
		System.out.println("Printing from Circle");
	}
}

public class RuntimePolymorphismShape {

	public static void main(String[] args) {
		Shape s;
		s = new Rectangle();
		s.display();
				
		s = new Triangle();
		s.display();
		
		s = new Circle();
		s.display();
	}

}
