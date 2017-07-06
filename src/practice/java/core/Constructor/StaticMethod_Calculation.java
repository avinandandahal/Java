package practice.java.core.Constructor;

public class StaticMethod_Calculation {

	static int cube(int x) {
		return x*x*x;
	}
	
	public static void main(String[] args) {
		
		int result = cube(2);
		System.out.println(result);

	}

}
