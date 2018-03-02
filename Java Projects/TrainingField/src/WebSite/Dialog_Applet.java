package WebSite;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

import java.awt.*;
public class Dialog_Applet extends JApplet{
		private static double sum=0.00;
	/**
	 * @param args
	 */
	public  void init() {
		// TODO Auto-generated method stub
		String a=JOptionPane.showInputDialog("Enter !st number : ");
		
		String b=JOptionPane.showInputDialog("Enter 2nd number : ");
			
		double n1=Double.parseDouble(a);
		double n2=Double.parseDouble(b);
		
		sum=n1+n2;
		
		
	}
	public  void paint(Graphics g){
		super.paint(g);
		g.drawString("The sum is"+sum, 200, 300);
	}

}
