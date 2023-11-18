package com.upskill.java_2;

public class Loops {
	
	/*
      
     Types of Loops
         1.For Loop
         2.While Loop
         3.DO While Loop
         4.Infinite Loop

	 */

	public static void main(String[] args) {
//		PracticeForLoop();
//		PraticwhileLoop();
//		PracticeDoWhileLoop();
//		PracticeInfiniteLoop();
		
		PraticeNestedForLoop();
	}

	
	public static  void PracticeForLoop() {                   	// For Loop - Do Again and again upto upper limit
		int i;                             	                  	// Initialize the variable
		for (i=1;i<=1000; i++) {                              	// setting lower limit, upper limit, increment or decrement
			System.out.println("For Loops Number = " + i);    	// statement
			
		}
	}
	
	public static void PraticwhileLoop() {                   	 // while loop- Do again and again upto condition match
		int i = 1;                                            	// Initialize the variable
		while (i<=10) {                                       	// setting condition
			System.out.println("while Loops Number = " + i);  	// Statement
			i++;                                              	// Increment or decrement
		};
		
		}
		
	public static void PracticeDoWhileLoop() {                   // Do while Loop-  Do action the match condition
		int i =1;                                                // Initialize the variable
		do { 
			System.out.println("Do While Loops Number = " + i);   //Statement
			i++;                                                  // Increment or decrement
		} while (i<=0);                                           // Checking Condition
		
		}
	
	public static void PracticeInfiniteLoop() {                   // Infinite Loop - Never ending Loop
		int i;                                                    // Initialize the variable
		for (i=1;   ; i++) {                                      //Setting no upper limit
			System.out.println("Infinte Loops Number = " + i);    //Statement
		}
			
	}
	
	public static void PraticeNestedForLoop() {                  //Nested Loop - Loop Inside another Loop
		int i;                                                   //Initialize i for Loop 1
		int j;                                                   //Initialize i for Loop 2
		
		for (i=1; i<=10; i++) {                                  //First Loop for i
			for (j=1; j<=10; j++) {                              //Second Loop for j        
				int multiplicationTable = i * j;
				System.out.print(multiplicationTable + " |");    //Statement for Loop 2
			
			}
			System.out.println(" ->");                           //Statement for Loop 1
		}
	}
	
	}
				
				
	
	
	

