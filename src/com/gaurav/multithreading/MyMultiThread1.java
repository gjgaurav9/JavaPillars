package com.gaurav.multithreading;

public class MyMultiThread1 {
	
	/* First thread created by JVM 
	This thread in also considered as the non-Deomon thread or Deomon thread*/
	public static void main(String[] args) {
		
		
		
		Task task = new Task();
		Thread thread =  new Thread(task);
		thread.start();
		try {
			thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("inside main ...");
	}
}