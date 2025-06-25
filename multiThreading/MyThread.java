package com.Bharani.multiThreading;

public class MyThread extends Thread {
	Resource resource;
	public MyThread(Resource resource) {
		this.resource=resource;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			resource.inc();
		}
	}
}
