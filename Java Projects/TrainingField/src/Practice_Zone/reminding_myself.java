package Practice_Zone;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.*;
public class reminding_myself extends JFrame{
	
	private JButton button;
	private JLabel label; 
		public void go(){
			setLayout(new FlowLayout());
			
			button=new JButton("OK");
			button.setBackground(Color.red);
			add(button);
			
			label=new JLabel(" ");
			
			add(label);
			
			Events e=new Events();
			button.addActionListener(e);
		}
		
		public class Events implements ActionListener{
	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stubo
				label.setBackground(Color.GREEN);
				label.setText("KEEP YOUR EYES ON ");
				
				
			}
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reminding_myself ob=new reminding_myself();
		ob.go();
		
		ob.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ob.setSize(400,400);
		ob.setVisible(true);
		ob.setTitle("WELCOME BACK ");
		

	}

}
