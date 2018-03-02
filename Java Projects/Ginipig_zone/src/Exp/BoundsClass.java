package Exp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BoundsClass extends JFrame{
	private JButton b1;
	public void go(){
		setLayout(null);
		b1=new JButton("Click me !");
		b1.setBounds(3,3,330,330);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoundsClass key=new BoundsClass();
		key.go();
		key.setSize(900,500);
		key.setDefaultCloseOperation(EXIT_ON_CLOSE);
		key.setVisible(true);
		

	}

}
