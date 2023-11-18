package com.upskill.java_6;

public class MultiThreading {
	
	/* MultiThreading is a Java feature that allows concurrent execution of two or more parts of the program.
	
	Threads can be created by two mechanism :
	
		1.Extending the thread class
		2.Implementing the runnable Interface */
	

	public static void main(String[] args) {
		int n = 6;
		for (int i= 0; i <n; i++) {
			MultithreadingThread obj = new MultithreadingThread();
			obj.start();
			
			
			Thread obj2 = new Thread(new MultihthreadingRunable());
			obj2.start();
		}

	}

}
	