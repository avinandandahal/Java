package practice.java.core.Inheritence;

class Homosapien{
	void Human() {
		System.out.println("Human is printing");
	}
}

class Men extends Homosapien{
	void drink() {
		System.out.println("Men is drinking Beer");
	}
} 

class Women extends Homosapien{
	void dance() {
		System.out.println("Women are dancing");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Women w = new Women();
		Men m = new Men();
		
		w.dance();
		w.Human();
		
		m.drink();
		m.Human();

	}

}
