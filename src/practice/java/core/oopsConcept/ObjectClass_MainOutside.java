package practice.java.core.oopsConcept;

public class ObjectClass_MainOutside {

	public static void main(String[] args) {
		
		OutsideClass oc = new OutsideClass();
		System.out.println(oc.name + oc.roll );

	}

}

class OutsideClass {
	
	int roll;
	String name;
	
}