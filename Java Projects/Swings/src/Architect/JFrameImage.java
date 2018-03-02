package Architect;

import java.awt.*;
import java.awt.event.*;
import java.awt.peer.KeyboardFocusManagerPeer;

import javax.swing.*;


public class JFrameImage extends JFrame  {
	private JButton b1,b2;
	private JLabel l1,l2,l3,l4,l5;
	
	public static int WIDTH=300;
	public static int HEIGHT=300;
	
	
	private ImageIcon i1=new ImageIcon("telescope.gif");
	private ImageIcon i2=new ImageIcon("idea.png");
	private ImageIcon i3=new ImageIcon("D.png");
	private ImageIcon i4=new ImageIcon("fan.gif");
	private ImageIcon i5=new ImageIcon("fan.gif");
	private ImageIcon i6=new ImageIcon("D.png");
	
	
	public  JFrameImage(String s){
		super(s);
		
		b1=new JButton(i5);
		b2=new JButton(i6);
		
		l1=new JLabel(" This is A creation of Almighty ALLAH ");
		l1.setIcon(i3);
		add(l1);
		
		l2=new JLabel(" these all are expressing the Greatness of ALLAH ");
		l2.setIcon(i4);
		add(l2);
		
		plant1 p=new plant1();
		b1.addActionListener(p);
		
		plant2 l=new plant2();
		b2.addActionListener(l);
		
		
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(2,2));
		c.add(b1);
		c.add(b2);
		
	}
	
		public class plant1 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				l1.setIcon(i5);
			}
			
		}
		public class plant2 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				l2.setIcon(i6);
				
			}
			
		}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameImage ob=new JFrameImage(" Image Button ");
		ob.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		ob.setSize(WIDTH,HEIGHT);
		ob.setVisible(true);
	}



}
