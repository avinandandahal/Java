package practice.java.core.Inheritence;

public class IsARelationship extends SecondClass {

	int bonus = 2000;
	
	public static void main(String[] args) {
		
		IsARelationship isarel = new IsARelationship();
		System.out.println(isarel.bonus + isarel.salary);
		System.out.println(isarel.bonus);
		System.out.println(isarel.salary);
	}

}

class SecondClass{
	int salary = 10000;
	
}