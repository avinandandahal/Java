package practice.java.core.Polymorphism;

class CashBank{
	float getRateOfInterest() {
		return 0;
	}
}

class ICCI extends CashBank{
	float getRateOfInterest() {
		return 8.4f;
	}
}

class Investment extends CashBank{
	float getRateOfInterest() {
		return 7.3f;
	}
}

class Global extends CashBank{
	float getRateOfInterest() {
		return 9.7f;
	}
}

public class RuntimePolymorphism02 {

	public static void main(String[] args) {
		CashBank cb;
		
		cb = new ICCI();
		System.out.println(cb.getRateOfInterest());
		
		cb = new Investment();
		System.out.println(cb.getRateOfInterest());
		
		cb = new Global();
		System.out.println(cb.getRateOfInterest());
		
//		
//		CashBank cb1 = new ICCI();
//		cb1.getRateOfInterest();
//		System.out.println(cb1.getRateOfInterest());
//		
//		CashBank cb2 = new Investment();
//		cb2.getRateOfInterest();
//		System.out.println(cb2.getRateOfInterest());
//		
//		CashBank cb3 = new Global();
//		cb3.getRateOfInterest();
//		System.out.println(cb3.getRateOfInterest());
//		
		
		
	}

}
