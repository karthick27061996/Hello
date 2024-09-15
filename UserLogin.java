package com.javaguides.javaswing.reg;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UserLogin extends JFrame
{
	JLabel label1,label2;
	JTextField t1,t2;
	JButton Login;
	
	UserLogin()
	{
		setTitle("Student Login");
		setSize(600,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
	}
	
	public static void main (String arg[]) 
	{
		UserLogin ul = new UserLogin();
	}

}
