package practice.java.core.Inheritence;

class Vehicle{
	void vehicle1() {
		System.out.println("vehicle and vehicle1 is printing");
	}
}

class Car extends Vehicle{
	void car1() {
		System.out.println("Car & car1 is printing");
	}
}

class NewCar extends Car{
	void newCar1() {
		System.out.println("NewCar and NewCar1 is priting");
	}
}

public class MultiLevelInheritence {

	public static void main(String[] args) {
		NewCar nc = new NewCar();
		nc.newCar1();
		nc.car1();
		nc.vehicle1();

	}

}
