package PROJECTS_OK;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
public class RANDOM_NUMBER extends JFrame {
	
	private JButton button;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JTextField text;
	int random=0,guess=0;
	
	public  RANDOM_NUMBER(){
		setLayout(new FlowLayout());
		
		label1=new JLabel("ENTER   A   RANDOM   NUMBER  1  TO 10  :  ");
		add(label1);
		
		text=new JTextField(5);
		add(text);
		
		button=new JButton("GUESS");
		add(button);
		
		label2=new JLabel("");
		add(label2);
		
		label3=new JLabel("");
		add(label3);
		
		label5=new JLabel("");
		add(label5);
		
		Event e=new Event();
		button.addActionListener(e);
		
	}
	
	public class Event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			random=(int)(Math.random()*10+1);
			try{
				guess=(int)(Double.parseDouble(text.getText()));
				if(random==guess){
					label2.setText("YOU HAVE WON THE GAME $$$$$$");
				}else if(random != guess){
					label3.setText("YOU LOST THE GAME !!!!!!!");
				}
				label5.setText("THE RANDOM NUMBER GANERATED : "+random);
			}catch(Exception ex){
				label4.setText("Please Enter Numbers only");
			}
			
			
		}
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RANDOM_NUMBER gui=new RANDOM_NUMBER();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300,170);
		gui.setTitle("RANDOM NUMBER GAME");
		gui.setVisible(true);
		
	}

}
