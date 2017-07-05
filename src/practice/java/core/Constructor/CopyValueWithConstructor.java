package practice.java.core.Constructor;

public class CopyValueWithConstructor {

	int id;
	String name;
	
	CopyValueWithConstructor(int i, String n){
		id = i;
		name = n;
	}
	
	CopyValueWithConstructor(CopyValueWithConstructor cv){
		id = cv.id;
		name = cv.name;
		
	}
	
	void diplay(){
		
		System.out.println(id+name);
	}
	
	public static void main(String[] args) {
		
		CopyValueWithConstructor cvwc1 = new CopyValueWithConstructor(1001, "Avi");
		CopyValueWithConstructor cvwc2 = new CopyValueWithConstructor(cvwc1);
		
		cvwc1.diplay();
		cvwc2.diplay();
				
	}

}
