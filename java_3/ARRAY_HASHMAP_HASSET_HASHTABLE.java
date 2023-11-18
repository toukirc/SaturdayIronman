package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class ARRAY_HASHMAP_HASSET_HASHTABLE {

	public static void main(String[] args) {
		int age = 30;										 	 // Variable	
		int[] ageIronMan = new int [] {25,27,31,37,43}; 		 // Array
		//Array index   			  [0] [1] [2] [3] [4]
		
		
		
		System.out.println("Student Age :" +ageIronMan [2]);
		System.out.println("Total Student :" +ageIronMan.length);
		
		
		String[] nameIronMan = new String[] {"Yousuf","Abdullah","Madan","Sumaiya","Jannatul"};
		System.out.println("Student Age :" +nameIronMan [2]);
		System.out.println("Total Student :" +nameIronMan.length);
		
		
		
		//Multi-Dimentional Array
		
		int [][] ageIronMan2D = {{25,32,37,21,27,32},		//[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]    
				                 {26,30,33,28}};				//[1][0] [1][1] [1][2] [1][3]
		
		
		System.out.println("Student Age 2D :" +ageIronMan2D [1][1]);		

		
		//  HashMap store multiple data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Yousuf", 28);
		Student.put("Abdullah", 22);
		Student.put("Madan", 32);
		Student.put("Jannatul", 24);
		Student.put("Toukir", 32);
		
		System.out.println("HashMap Student Age 2D :" + Student.get("Toukir"));
		
		
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("UnitedStates", "DC");
		Capital.put("Bangladesh", "Dhaka");
		Capital.put("Canada", "Ottowa");
		Capital.put("UK", "London");
		Capital.put("Spain", "Madrid");
		
		System.out.println("Capital City :" + Capital.get("UK"));
		
		//HashSet store un-orderd collection containing unique value, implementation on set interface
		
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Toyota");
		car.add("tesla");
		car.add("Audi");
		
		System.out.println("Car : " + car);
		
		//HashTable store multiple data using key-value pair, no duplicate,
		// also is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("Bangladesh", "Asia");
		Region.put("usa", "America");
	
		System.out.println("Region : " + Region.get("Bangladesh") );
		
		
		
		}
		
	}
	





