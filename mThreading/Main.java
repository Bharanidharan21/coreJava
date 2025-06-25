package com.Bharani.mThreading;

public class Main {
	public static void main(String []args)throws Exception{
		
		MyWindow window = new MyWindow();
		window.setSize(800,700);
		window.setVisible(true);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		
		A thread1= new A(window);
		B thread2= new B(window);
		
		thread1.start();
		thread2.start();
		
	}
}
