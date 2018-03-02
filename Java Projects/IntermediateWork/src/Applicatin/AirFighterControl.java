package Applicatin;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AirFighterControl extends JFrame{
	
	

	public void ActionPanel(){
		
		AirCraft key=new AirCraft();
		 add(key);
		
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirFighterControl control=new AirFighterControl();
		control.setDefaultCloseOperation(EXIT_ON_CLOSE);
		control.setVisible(true);
		control.setSize(1400,750);
		control.setTitle("AirCraft Control");
		control.ActionPanel();

	}

	 

}
class AirCraft extends JPanel {
	
	static int x=600,y=500; 	
	public  void paintComponent(Graphics g){
		Graphics2D g2=(Graphics2D)g;
		 
	
		Image aircraft=Toolkit.getDefaultToolkit().getImage("b1.gif");
		g.drawImage(aircraft,x,y,60,80, this);
		
		
		Image h1=Toolkit.getDefaultToolkit().getImage("h2.gif");
		g.drawImage(h1,50, 160,40,40, this);
		
		
		Image w=Toolkit.getDefaultToolkit().getImage("h2.gif");
		g.drawImage(w,00, 160,40,40, this);
		
		Image g1=Toolkit.getDefaultToolkit().getImage("g3.gif");
		g.drawImage(g1,1000, 160,80,60, this);
		
		Image g21=Toolkit.getDefaultToolkit().getImage("g2.gif");
		g.drawImage(g21,500, 160,50,30, this);
		
		Image g3=Toolkit.getDefaultToolkit().getImage("g1.gif");
		g.drawImage(g3,100, 100,50,30, this);
		
	}

	
	 


	
}
 
