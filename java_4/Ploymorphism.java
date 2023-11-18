package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Ploymorphism extends MethodType{

/* Polymorphism is the ability of an object to take on many forms.
    
    - Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
    what is static binding? its Compile Overloading --polymorphysim
    - Method Overidding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
	what is dynamic binding? its Runtime Overloading --polymorphysim
*
*/



	public static void main(String[] args) {
		car('X');
		
		Ploymorphism obj = new Ploymorphism();
		//Supe	rcar obj2 = new Supercar();      Multiple object learn
		
		obj.annualIncomeVoid();
	}
	
	 // Void Method imported and wrote again
	
	public void annualIncomeVoid() {
		
	      int calculateAnnualIncome = hourlyIncome *2000;
	      int bonus = 25000;
	      int rent = 15000;
	      int Side = 10000;
	      int totalincome = calculateAnnualIncome + bonus + rent + Side;
	     System.out.println("My Annual Income = " +totalincome );
}
	
	//Method Overloading examples 
	
	
	public static void car () {
		System.out.println("My Car is ACURA !!");
	
	}

	
	public static void car (String color) {
		System.out.println("My Car is ACURA !! It has color:" + color); // Method Over loading or 	static binding
}

	public static void car (int door) {
		System.out.println("My Car is ACURA !! It has door:" + door);	// Method Over loading or 	static binding
	}
	
	public static void car (int door, String color ) {
		System.out.println("My Car is ACURA !! It has door:" + door + ", It is color:" + color);	
	}
	public static void car (boolean iscombustionengine ) {
		System.out.println("My car us ACURA!! It is Combustion Engine" + iscombustionengine);
		
	}
		
	public static void car (char a) {
		System.out.println("My car us ACURA!! It Drives " + a);
		
	}
	
	










}