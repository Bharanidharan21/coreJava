package com.Bharani.mThreading;

public class A extends Thread {
	MyWindow window;

	public A(MyWindow window) {
		this.window = window;
	}

	public void run() {
		String result = "TATA";
		for (int i = 1; i <= 10; i++) {
			result += i + "x" + 3 + "=" + i * 3 + "\n";
			window.txt1.setText(result);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}

}
