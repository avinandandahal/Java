package practice.java.core.Polymorphism;

class Animals{
	void eat() {
		System.out.println("Printing from Animals");
	}
}

class Rat extends Animals{
	void eat() {
		System.out.println("Printing from Rat");
	}
}

class Zebra extends Animals{
	void eat() {
		System.out.println("Printing from Zebra");
	}
}

public class RuntimePolymorphismAnimal {

	public static void main(String[] args) {
		Animals a;
		
		a = new Rat();
		a.eat();
		
		a= new Zebra();
		a.eat();

	}

}
