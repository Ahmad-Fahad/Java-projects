package Architect;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Absolutepositioning extends JFrame{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Absolutepositioning key=new Absolutepositioning();
		key.go();
		key.setSize(800,600);
		key.setDefaultCloseOperation(EXIT_ON_CLOSE);
		key.setVisible(true);

	}

	private void go() {
		// TODO Auto-generated method stub
		
		setLayout(new BorderLayout());
		
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		
		JButton btn1=new JButton(" ? ");
		JButton btn2=new JButton(" MID ");
		JButton btn3=new JButton(" RL");
		JButton btn4=new JButton(" RR ");
		JButton btn5=new JButton(" LL ");
		JButton btn6=new JButton(" LR ");
		
		JLabel l1=new JLabel(" Have u any Idea Mosai ");
		
		panel1.setLayout(new FlowLayout());
		panel1.add(btn3);
		panel1.add(btn4);
		panel1.setBackground(Color.darkGray);
		add(panel1,BorderLayout.EAST);
		
		panel2.setLayout(new FlowLayout());
		panel2.add(btn5);
		panel2.add(btn6);
		panel2.setBackground(Color.darkGray);
		add(panel2,BorderLayout.WEST);
		
		panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));
		panel3.add(l1);
		panel3.add(btn1);
		panel3.setBackground(Color.LIGHT_GRAY);
		add(panel3,BorderLayout.CENTER);
		
	}

}
