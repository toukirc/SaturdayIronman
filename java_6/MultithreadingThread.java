package com.upskill.java_6;

public class MultithreadingThread extends Thread{
	
	public void run() {
		try {
			System.out.println("Thread number # " 
		+ Thread.currentThread().getId() + " is Rinning");
		} catch (Exception e) {
			System.out.println("Execption is cought");
			e.printStackTrace();
		}
	}
}
// test add