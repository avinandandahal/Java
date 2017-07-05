//calling method with anonymous object  

package practice.java.core.oopsConcept;

public class ObjectClass_AnonyObject {

	void fact(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++){  
			   fact=fact*i;  
		}
		
		System.out.println("Factorial is: "+ fact);
	}
	
	
	public static void main(String[] args) {
		
		new ObjectClass_AnonyObject().fact(5);//calling method with anonymous object  

	}

}
