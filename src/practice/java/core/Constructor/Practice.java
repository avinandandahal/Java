package practice.java.core.Constructor;

public class Practice {

	void m(Practice Obj) {
		System.out.println("Printing from m");
	}
	
	void n() {
		m(this);
	}
	
	public static void main(String[] args) {
		Practice p = new Practice();
		p.n();
	}
}
