package com.upskill.java_1;

public class Variables {
	
	// Variables in Java
	
	public  String country = "USA";                    // Instance or Global Variable - Variable declared in class level, outside method

    public static String region = "North America";    //Static Variable - Variable belongs to class and don't require creating object

	public static void main(String[] args) {
		
		
		String city	= "New York";         
		String police= "NYPD";
		System.out.println(city);
		System.out.println(region);
		//System.out.println(county);
		nj("Passiac");
		pa("Bensalem");
		Variables obj = new Variables();
		System.out.println(obj.country);
	}
	
	public static void nj (String county) {     //Method Parameter - variables used in method parameter
		String city = "Haledon";                //Local Variable - Variables declared in Methods
		String police ="HPD";
		System.out.println(city);
		System.out.println(region);
		System.out.println(county);
	}
	
	public static void pa(String county) {
		String city ="Phili";
		String police ="PPD";
		System.out.println(city);
		System.out.println(region);
		System.out.println(county);
	}
	

}
