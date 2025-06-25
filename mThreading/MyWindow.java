package com.Bharani.mThreading;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyWindow extends JFrame {
	JTextArea txt1;
	JTextArea txt2;
	
	public MyWindow()
	{
		txt1 = new JTextArea();
		txt2 = new JTextArea();
		
		txt1.setText("Tata");
		txt2.setText("STRIVE");
		
		txt1.setBounds(0,100,150,600);
		txt2.setBounds(160,100,150,600);
		
		
		setLayout(null);
		add(txt1);
		add(txt2);
		
}
}
