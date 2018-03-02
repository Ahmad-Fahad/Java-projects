package CodeStore;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LeapYear extends JFrame{
	
	private JLabel l,l0;
	private JButton b,clear;
	private JTextField t;
	private JPanel p1,p2,p3,p4;
	
	public void go(){
		setLayout(new FlowLayout());
		
		p1=new JPanel();
		p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
		
		p2=new JPanel();
		p2.setLayout(new FlowLayout());
		
		l=new JLabel("Enter a Year : ");
		l.setFont(new Font("ALGERIAN",Font.BOLD,25));
		p2.add(l);
		
		t=new JTextField(6);
		t.setFont(new Font("ALGERIAN",Font.BOLD,25));
		p2.add(t);
		
		p4=new JPanel();
		
		b=new JButton(" OK ");
		b.setFont(new Font("ALGERIAN",Font.BOLD,25));
		b.setBackground(Color.LIGHT_GRAY);
		p4.add(b);
		
		clear=new JButton(" Clear ");
		clear.setFont(new Font("ALGERIAN",Font.BOLD,25));
		clear.setBackground(Color.LIGHT_GRAY);
		p4.add(clear);
		
		p3=new JPanel();
		p3.setLayout(new BoxLayout(p3,BoxLayout.Y_AXIS));
		
		l0=new JLabel("");
		l0.setFont(new Font("ALGERIAN",Font.BOLD,40));
		l0.setForeground(Color.RED);
		p3.add(l0);
	
		
		p1.add(p2);
		p1.add(p4);
		p1.add(p3);
		add(p1);
		
		
		Calculation e=new Calculation();
		b.addActionListener(e);
		clear.addActionListener(e);
		
	}
	
	public class Calculation implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent a) {
			// TODO Auto-generated method stub
			if(a.getSource()==b){
			int n=0,q=0,r=0;
			n=(int)(Double.parseDouble(t.getText()));
			r=n%4;
			if(r==0){
				l0.setText("Leap Year");
			}else{
				l0.setText("Not A Leap Year");
			}
			}else if(a.getSource()==clear) {
				l0.setText("");
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeapYear key=new LeapYear();
		key.go();
		key.setTitle("Leapyear Calculator");
		key.setDefaultCloseOperation(EXIT_ON_CLOSE);
		key.setVisible(true);
		key.setSize(800,600);
		

	}

}
