package com.Bharani.mThrad;

public class Consumer extends Thread {
	Resource resource;

	public Consumer(Resource resouce) {
		this.resource = resouce;

	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			int data = resource.getMyData();
			System.out.println("GET: " + data);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}

}
