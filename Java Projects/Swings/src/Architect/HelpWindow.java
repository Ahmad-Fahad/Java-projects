package Architect;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HelpWindow extends JDialog{
	JLabel label;
	public HelpWindow(JFrame frame){
		
		
	super(frame,"Help Window",true);
	setLayout(new FlowLayout());
	label=new JLabel("I m tired ,this is  new window !!!");
	add(label);
	}
	

}
