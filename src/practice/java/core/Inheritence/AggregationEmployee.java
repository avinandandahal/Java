/*
 * In this example, Employee has an object of Address, address object contains its own informations such as city, 
 * state, country etc. 
 * In such case relationship is Employee HAS-A address.
 */
/*
 * Also see Address.java
 */

package practice.java.core.Inheritence;

public class AggregationEmployee {

	int id;
	String name;
	AggregationAddress address;
		
	public AggregationEmployee(int id, String name, AggregationAddress address) {
		this.id = id;
		this.name = name;
		this.address = address;		
	}
	
	void display() {
		System.out.println(id +" "+ name + " " + address.city + " " + address.country + " " + address.state );
	}
	
	public static void main(String[] args) {
		
		AggregationAddress aa1 = new AggregationAddress("irving", "dallas", "texas");
		AggregationAddress aa2 = new AggregationAddress("tulsa", "dallas", "texas");
		
		AggregationEmployee ae1 = new AggregationEmployee(10, "Avi", aa1);
		AggregationEmployee ae2 = new AggregationEmployee(11, "Ravi", aa2);
		AggregationEmployee ae3 = new AggregationEmployee(12, "hari", aa2);
		
		ae1.display();
		ae2.display();
		ae3.display();
	}

}
