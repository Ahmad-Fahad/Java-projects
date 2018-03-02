package Pc_Alarm;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

 

public class PcAlarm extends JFrame {
	public static int x=0,y=0;
	private JButton start,stop,clear;
	private JLabel h1,h,l1,m1,m,l2,s1,s,l9,l0,ll;
	public JTextField th,tm,ts;
	 private ImageIcon im=new ImageIcon("timeRuns.gif");
	private JPanel p1=new JPanel();
	private JPanel p2=new JPanel();
	private JPanel p3=new JPanel();
	private JPanel p4=new JPanel();
	private JPanel p5=new JPanel();
	private JPanel p6=new JPanel();
	  
	public void action(){
		setLayout(new FlowLayout());
		
		 
		p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
		
		l0=new JLabel("");
		l0.setIcon(im);
		p5.add(l0);
		
		h=new JLabel("00");
		h.setFont(new Font("ALGERIAN",Font.BOLD,100));
		p2.add(h);
		 
		l1=new JLabel(" : ");
		l1.setFont(new Font("ALGERIAN",Font.BOLD,100));
		p2.add(l1);
	 
		m=new JLabel("00");
		m.setFont(new Font("ALGERIAN",Font.BOLD,100));
		p2.add(m);
		l2=new JLabel(" : ");
		l2.setFont(new Font("ALGERIAN",Font.BOLD,100));
		p2.add(l2);
		s=new JLabel("00");
		s.setFont(new Font("ALGERIAN",Font.BOLD,100));
		p2.add(s);
		
		start=new JButton(" Start ");
		start.setBackground(Color.LIGHT_GRAY);
		p3.add(start);
		stop=new JButton(" Stop ");
		stop.setBackground(Color.LIGHT_GRAY);
		p3.add(stop);
		clear=new JButton(" Clear ");
		clear.setBackground(Color.LIGHT_GRAY);
		p3.add(clear);
		
		ll=new JLabel("Enter A time : ");
		p6.add(ll);
		th=new JTextField(4);
		p6.add(th);
		
		ll=new JLabel(":");
		p6.add(ll);
		tm=new JTextField(4);
		p6.add(tm);
		
		ll=new JLabel(":");
		p6.add(ll);
		ts=new JTextField(4);
		p6.add(ts);
	   
		p1.add(p5);
		p1.add(p2);
		p1.add(p6);
		p1.add(p3);
		p1.add(p4);
		add(p1);
		
		ButtonClicked e=new ButtonClicked();
		start.addActionListener(e);
		stop.addActionListener(e);
		clear.addActionListener(e);
		
		
		
	}
	
	public class ButtonClicked implements ActionListener,Runnable{
		Thread th=new Thread();
		public void actionPerformed(ActionEvent a) {
			// TODO Auto-generated method stub
			
			if(a.getSource()==start){
				 th.start();
			}else if(a.getSource()==stop){
				th.stop();
			}else if(a.getSource()==clear){
				  
				 h.setText("00");
				 m.setText("00");
				 s.setText("00");
				
				 tm.setText("");
				 ts.setText("");
			}
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			int timh,timm,tims;
			
			timm=(int)(Double.parseDouble(tm.getText()));
			tims=(int)(Double.parseDouble(ts.getText()));
			
		
			int x=1,y=0;
			 
		}
		 		

		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PcAlarm key =new  PcAlarm();
		key.setDefaultCloseOperation(EXIT_ON_CLOSE);
		key.setVisible(true);;
		key.setSize(1500,750);
		key.action();
		 
		

	}
 
}
 