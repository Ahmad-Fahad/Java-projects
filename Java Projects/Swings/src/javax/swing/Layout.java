package javax.swing;
import javax.swing.*;
import javax.swing.Beeper.Event;

import java.awt.*;
import java.awt.event.*;
public class Layout extends JFrame{
	private JButton button1,button2,button3,button4,button5;
	
	
	public void go(){
		setLayout(new GridLayout(2,5));
		
		button1=new JButton(" A ");
		add(button1);
		
		button2=new JButton(" B ");
		add(button2);
		
		button3=new JButton(" C ");
		add(button3);
		
		button4=new JButton(" D ");
		add(button4);
		
		button5=new JButton(" E ");
		add(button5);
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout ob=new Layout();
		ob.go();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setSize(300,300);
		ob.setVisible(true);
		ob.setTitle("Grid exeample");

	}

}
