package com.gaurav.multithreading;

public class MyMultiThread2 extends Thread{
	
	public static void main(String[] args) {
		MyMultiThread2 multiThread2 = new MyMultiThread2();
		multiThread2.start();
		System.out.println("Inside main..");
		
	}
	
	@Override
	public void run() {
		System.out.println("Inside Run..");
		go();
		
	}

	private void go() {
		System.out.println("inside go ...");
		more();
		
	}

	private void more() {
		System.out.println("inside more ..");
	}
	
	

}
