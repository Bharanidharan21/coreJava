package com.Bharani.mThrad;

public class UserInterface {
	public static void main(String[]args) {
		Resource resource=new Resource();
		Consumer consumer=new Consumer(resource);
		Supplier supplier=new Supplier(resource);
		consumer.start();
		supplier.start();
		}

	
}