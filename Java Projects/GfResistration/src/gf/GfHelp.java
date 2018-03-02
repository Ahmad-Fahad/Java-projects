package gf;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Created by Sheikh Muhammad on 09-03-16.
 */
public class GfHelp extends JFrame {
	public JLabel l1,l2,l3;
	public JButton b1,b2,b3;
	public JTextField t1,t2,t3,t4;
	 private ImageIcon i1=new ImageIcon("l1.gif");
	 private ImageIcon i2=new ImageIcon("l2.gif");
	 private ImageIcon i3=new ImageIcon("l3.gif");



    public  GfHelp(){
    	setLayout(new FlowLayout());
    	JPanel p1=new JPanel();
    	JPanel p2=new JPanel();
    	JPanel p3=new JPanel();
    	JPanel p4=new JPanel();
    	JPanel p5=new JPanel();
    	JPanel p6=new JPanel();
    	JPanel p7=new JPanel();
    	JPanel p0=new JPanel();
    	p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
    	l1=new JLabel(" ...True Love...");
    	  l1.setFont(new Font("Script MT Bold", Font.BOLD, 80));
          l1.setForeground(Color.black);
          p0.add(l1);
          
          l3=new JLabel("");
          l3.setIcon(i2);
          p7.add(l3);
          
    	l1=new JLabel(" Your Name :   ");
    	  l1.setFont(new Font("Script MT Bold", Font.BOLD,28 ));
          l1.setForeground(Color.black);
    	p2.add(l1);
    	
    	t1=new JTextField(10);
    	 t1.setFont(new Font("Script MT Bold", Font.BOLD,28 ));
         t1.setForeground(Color.black);
    	
    	p2.add(t1);
    	
    	l1=new JLabel(" Phone number :  ");
    	 l1.setFont(new Font("Script MT Bold", Font.BOLD,28 ));
         l1.setForeground(Color.black);
    	p3.add(l1);
    	
    	t2=new JTextField(10);
    	 t2.setFont(new Font("Script MT Bold", Font.BOLD,28 ));
         t2.setForeground(Color.black);
    	p3.add(t2);
    	
    	
    	l1=new JLabel(" FaceBook ID :  ");
    	 l1.setFont(new Font("Script MT Bold", Font.BOLD,28 ));
         l1.setForeground(Color.black);
    	p4.add(l1);
    	
    	t3=new JTextField(10);
    	 t3.setFont(new Font("Script MT Bold", Font.BOLD,28 ));
         t3.setForeground(Color.black);
    	p4.add(t3);
    	
    	b1=new JButton(" Confirm ");
    	 b1.setFont(new Font("Script MT Bold", Font.BOLD,28 ));
       //  b1.setForeground(Color.blue);
         b1.setBackground(Color.lightGray);
    	p5.add(b1);
    	
    	l2=new JLabel(" ");
    	 l2.setFont(new Font("Script MT Bold", Font.BOLD,38 ));
         l2.setForeground(Color.red);
    	p6.add(l2);
    	
    	p1.add(p0);
    	p1.add(p7);
    	p1.add(p2);
    	p1.add(p3);
    	p1.add(p4);
    	p1.add(p5);
    	p1.add(p6);
    	add(p1);
    	
    	confirm a=new confirm();
    	b1.addActionListener(a);
    	
    			
    	



    }
    public class confirm implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String s;
			
			if(t1.getText()=="" || t2.getText()=="" || t3.getText()=="" ){
				l2.setText("Please complete all informations ");
			}else{
			l2.setText(" Sorry too late i have already three girlfriend ");
			}
			
		}
    	
    }

    public static void main(String[] args) {
        GfHelp k=new GfHelp();
         
        k.setVisible(true);
        k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
