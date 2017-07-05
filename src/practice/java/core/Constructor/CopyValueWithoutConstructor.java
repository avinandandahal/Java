package practice.java.core.Constructor;

public class CopyValueWithoutConstructor {

	int id;
	String name;
	
	CopyValueWithoutConstructor(int i, String n){
		id = i;
		name = n;
	}
	
	CopyValueWithoutConstructor(){}
	
	void diplay(){
		
		System.out.println(id+name);
	}
	
	public static void main(String[] args) {
		
		CopyValueWithoutConstructor cvwc1 = new CopyValueWithoutConstructor(1001, "Avi");
		CopyValueWithoutConstructor cvwc2 = new CopyValueWithoutConstructor();
		
		cvwc2.id = cvwc1.id;
		cvwc2.name = cvwc1.name;		
		
		cvwc1.diplay();
		cvwc2.diplay();
				
	}

}
