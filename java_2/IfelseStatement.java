package com.upskill.java_2;

public class IfelseStatement {

	public static void main(String[] args) {
		
		int age = 0;
		
		if (age <= 18) {
			if (age <= 0) {
				System.out.println("Invalida Age");
			}
			else
			System.out.println("You Are a Children");
			
		} else if(age > 13 && age <18) {
			
			System.out.println("You Are a Teenager");
		} else if(age >= 60) {
			if (age >= 100) { 
			System.out.println("You Are a Champion");
		}	else 
			System.out.println("You Are a Senior");
		} else {
			
			System.out.println("You Are an Adult");
		}
			

	}

}
