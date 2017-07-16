package practice.java.core.Polymorphism;

class Aeroplane{
	
}

public class InstanceOf02 extends Aeroplane{

	public static void main(String[] args) {
		Aeroplane a = new InstanceOf02();
		System.out.println(a instanceof Aeroplane); //returns true or false

	}

}
