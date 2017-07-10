/*
 * Consider a situation, Employee object contains many informations such as id, name, emailId etc. 
 * It contains one more object named address, which contains its own informations such as city, state, country, 
 * zipcode etc. as given below.
 */
package practice.java.core.Inheritence;

class Operation{
	int square(int n) {
		return n*n;
	}
}

public class Aggregation {

	Operation op;
	double pi = 3.14;
	
	double area(int radius){  
		   op=new Operation();  
		   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
		   return pi*rsquare;  
	}  
	
	public static void main(String[] args) {

		Aggregation c=new Aggregation();  
		   double result=c.area(5);  
		   System.out.println(result);  
	}

}
