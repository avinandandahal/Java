package practice.java.core.Constructor;

public class Practice {

	int id;
	String name;
	
	Practice(int i, String n){
		id = i;
		name = n;
	}
	
	Practice(Practice p){
		id = p.id;
		name = p.name;
	}
	
	void display() {
		System.out.println("id:"+id+" Name:"+name);
	}
		
	public static void main(String[] args) {
		Practice p1 = new Practice(1, "Avi");
		Practice p2 = new Practice(2, "Ravi");
		
		p1.display();
		p2.display();
		

	}

}
