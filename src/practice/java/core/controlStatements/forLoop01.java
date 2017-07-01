package practice.java.core.controlStatements;

public class forLoop01 {

	public static void main(String[] args) {
		
		/*
		  for(int i=1;i<=10;i++){  
		        System.out.println(i);  
		    }   
		 */
		int arr[] = {21, 24, 45, 55, 56};
		for(int var:arr) {
			System.out.println(var);
		}
	}
}
