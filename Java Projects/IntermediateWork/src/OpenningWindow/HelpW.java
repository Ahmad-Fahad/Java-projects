package OpenningWindow;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelpW extends JFrame{
	JLabel l;
	public  HelpW(){
		setLayout(new FlowLayout());
		l=new JLabel(" Ok i m  comming ");
		add(l);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelpW key=new HelpW();
		key.setDefaultCloseOperation(EXIT_ON_CLOSE);
		key.setVisible(true);;
		
		 


 
	 
	}
}
