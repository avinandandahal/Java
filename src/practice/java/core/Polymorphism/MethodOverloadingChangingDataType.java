/*
 * If a class has multiple methods having same name but different in parameters, it is known as Method Overloading. 
 */


package practice.java.core.Polymorphism;

class AdderClass{
	static int Add(int a, int b) {
		return a+b;
	}
	static double Add(double a, double b) {
		return a+b;
	}
}

public class MethodOverloadingChangingDataType {

	public static void main(String[] args) {
		int x = AdderClass.Add(1,2);
		double y = AdderClass.Add(2.2, 3.5);
		
		System.out.println(x);
		System.out.println(y);
	}

}
