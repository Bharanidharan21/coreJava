package com.Bharani.mThreading;

public class B {
	MyWindow window;

	public B(MyWindow window) {
		this.window = window;
	}

	public void run() {
		String result = "";
		for (int i = 1; i <= 10; i++) {
			result += i + "x" + 7 + "=" + i * 7 + "\n";
			window.txt2.setText(result);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

}
