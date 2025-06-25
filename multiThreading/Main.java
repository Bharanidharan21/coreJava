package com.Bharani.multiThreading;

public class Main {
	public static void main(String[]args) throws Exception  {
		Resource resource=new Resource();
		MyThread thread1=new MyThread(resource);
		MyThread thread2=new MyThread(resource);
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		System.out.println(resource.getcount());
	}

}
