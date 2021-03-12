package com.ibm;

public class AnotherWorker implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("in another worker thread="+Thread.currentThread());
		
	}
}
