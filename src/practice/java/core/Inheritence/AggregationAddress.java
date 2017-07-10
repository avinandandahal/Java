/*
 * In this example, Employee has an object of Address, address object contains its own informations such as city, 
 * state, country etc. 
 * In such case relationship is Employee HAS-A address.
 */

/*
 * Also see AggregationEmployee.java . It is extension
 */

package practice.java.core.Inheritence;

public class AggregationAddress {
	
	String city, state, country;
	
	
	public AggregationAddress(String city, String state, String country){
		this.city = city;
		this.state = state;
		this.country = country;		
	}

}
