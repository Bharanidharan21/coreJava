package com.Bharani.mThrad;

public class Supplier extends Thread {
	Resource resource;

	public Supplier(Resource resouce) {
		this.resource = resouce;
	}

	public void run() {
		for(int i=1;i<10;i++) {
			int data=(int)(Math.random()*1000);
			System.out.println("SET: "+data);
			resource.setMyData(data);
			try {Thread.sleep(50);}catch(Exception e) {}
	}

}
}
