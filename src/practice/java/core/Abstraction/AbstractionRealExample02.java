package practice.java.core.Abstraction;

abstract class Bank{
	abstract double getInterest();
}

class SBI extends Bank{

	@Override
	double getInterest() {
		return 9.1;		
	}
	
}

class PBI extends Bank{

	@Override
	double getInterest() {
		return 8.7;		
	}
	
}

public class AbstractionRealExample02 {

	public static void main(String[] args) {
		Bank b1 = new PBI();
		b1.getInterest();
		Bank b2 = new SBI();
		b2.getInterest();
		System.out.println("PBI Interest:" + b1.getInterest()+" & SBI Interest:"+b2.getInterest());
		
	}

}
