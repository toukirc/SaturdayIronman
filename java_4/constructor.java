package com.upskill.java_4;

public class constructor {

	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	
	String studentName;
	int studentAge;
	
	
	public constructor(String name) {
		studentName = name;	
	}
	
	public constructor(int age) {
		studentAge = age;	
	}
	
	public constructor(String name,int age) {
		studentName = name;
		studentAge = age;
		
	}	
	
	
	public static void main(String[] args) {
		constructor obj = new constructor("Toukir");
		System.out.println(obj.studentName);	
		
		
		constructor obj2 = new constructor(30);
		System.out.println(obj2.studentAge);
		
		constructor obj3 = new constructor("Amma", 25);
		System.out.println(obj3.studentName);
		System.out.println(obj3.studentAge);
	}

}
