package com.upskill.java_4;

public class Encapsulation {
	
	// Encapsulation used to hide the data using setter and getter method
	// Private protected information PPI
	// Private Medical information PMI

	private String name ="upskill";
	private int ssn ;
	private String username = "Toukir";
	
	
	// Setter Method - name
	
	public void setname(String value) {      // Set the data, write
		name = value;
	}
	
	
	// Getter Method - name
	
	public String getname() {				// get the data, read
		
		return name;
	}
	
	//ssn - setter Method					// Set the data, write only
	
	public void setssn(int value) {				
		
		ssn = value;
	}
			
	
	public String getusername() {				// get the data, read	only		
		
		return username;
		
}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setname("Toukir");
		System.out.println(obj.getname());
		obj.setssn(123456);
		System.out.println(obj.getusername());

	}

}
