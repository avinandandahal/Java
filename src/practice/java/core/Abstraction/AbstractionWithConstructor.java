//Abstract class having constructor, data member, methods etc.
//
//An abstract class can have data member, abstract method, method body, constructor and even main() method.

package practice.java.core.Abstraction;

abstract class MotorBike{
	MotorBike(){
		System.out.println("Motobike is created");
	}
	
	abstract void Run();
	void headLights() {
		System.out.println("Motorbike has a good headlight");
	}
}

class Honda extends MotorBike{

	@Override
	void Run() {
		System.out.println("MotorBike Running smoothly");		
	}	
}

public class AbstractionWithConstructor {

	public static void main(String[] args) {
		MotorBike mb = new Honda();
		mb.Run();
		mb.headLights();
	}
}
