package com.gaurav.multithreading;

public class Task implements Runnable {

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
