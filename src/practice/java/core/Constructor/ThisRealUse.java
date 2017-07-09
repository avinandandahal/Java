package practice.java.core.Constructor;

public class ThisRealUse {

	void m() {
		System.out.println(this); //prints same reference ID 
	}
	
	
	public static void main(String[] args) {
		
		ThisRealUse tru = new ThisRealUse();
		
		System.out.println(tru);//prints the reference ID 
		
		tru.m();
		
		

	}

}
