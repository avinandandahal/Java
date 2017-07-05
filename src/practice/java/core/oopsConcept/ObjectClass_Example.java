/*
 * Object, Class and Constructor in Java
 * */

package practice.java.core.oopsConcept;

public class ObjectClass_Example {

	public static void main(String[] args) {

		Account a1 = new Account();
		a1.insert(1111, "Avi", 2000);
		a1.display();
		a1.checkBalance();
		a1.deposit(2000);
		a1.checkBalance();
		a1.withdraw(1500);
		a1.checkBalance();

	}

}

class Account{
	int acc_no;
	String name;
	float amount;
	
	void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}
	
	void deposit(float amt) {
		amount = amount + amt;
		System.out.println("$"+amt+" deposited");
	}
	
	void withdraw(float amt){
		
		if(amount<amt) {
			System.out.println("Insufficient Balance");
		}
		else {
			amount = amount-amt;
			System.out.println("$"+ amount + " remaining. " + "$"+amt+" withdrawn.");
		}		
	}
	
	void checkBalance() {
		System.out.println("Balance is: "+amount);
	}
	
	void display() {
		System.out.println(acc_no+" "+ name + " " + amount);
	}
}
