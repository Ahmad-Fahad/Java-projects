package Project_Dispensary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Do_U_Wanna_Know extends JFrame {
		public JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
		public JLabel l1,l2,l3,l4,l5,l7,l6,l8,l9,l0,l11;
		public JTextArea t;
		public void Engine(){
			setLayout(new FlowLayout());
	

			
			JPanel pn1=new JPanel();
			pn1.setLayout(new BoxLayout(pn1,BoxLayout.Y_AXIS));
			
			l1=new JLabel("WE NEED TO KNOW .......  ?  ");
			l1.setFont(new Font("courier",Font.BOLD,35));
			l1.setForeground(Color.BLUE);
			pn1.add(l1);
			
			l11=new JLabel("                                               ");
			pn1.add(l11);
			
			l3=new JLabel("How much importance of you to ALLAH  ");
			l3.setFont(new Font("ALGERIAN",Font.ITALIC,25));
			//l3.setForeground(Color.BLUE);
			pn1.add(l3);
			
			b1=new JButton("  ?  ");
			b1.setBackground(Color.GREEN);
			pn1.add(b1);
			
			l2=new JLabel(" How much important you will be  ");
			l2.setFont(new Font("ALGERIAN",Font.ITALIC,25));
			//l2.setForeground(Color.BLUE);
			pn1.add(l2);
			

			
			b2=new JButton("  ?  ");
			b2.setBackground(Color.GREEN);
			pn1.add(b2);
			
			l4=new JLabel(" Who will love you ");
			l4.setFont(new Font("ALGERIAN",Font.ITALIC,25));
		//	l4.setForeground(Color.BLUE);
			pn1.add(l4);
			
			b3=new JButton("  ?  ");
			b3.setBackground(Color.GREEN);
			pn1.add(b3);
			
			l5=new JLabel(" which thing will be dependent of you  ");
			l5.setFont(new Font("ALGERIAN",Font.ITALIC,25));
			//l5.setForeground(Color.BLUE);
			pn1.add(l5);
			
			b4=new JButton("  ?  ");
			b4.setBackground(Color.GREEN);
			pn1.add(b4);
			
			l6=new JLabel(" What is the traits of Muslim ");
			l6.setFont(new Font("ALGERIAN",Font.ITALIC,25));
		//	l6.setForeground(Color.BLUE);
			pn1.add(l6);
			
			b5=new JButton("  ?  ");
			b5.setBackground(Color.GREEN);
			pn1.add(b5);
			
			l7=new JLabel(" What is the reason for why muslims are dominated ");
			l7.setFont(new Font("ALGERIAN",Font.ITALIC,25));
			//l7.setForeground(Color.BLUE);
			pn1.add(l7);
			
			b7=new JButton("  ?  ");
			b7.setBackground(Color.GREEN);
			pn1.add(b7);
			
			l8=new JLabel(" How can you remove your worries of livelihood ");
			l8.setFont(new Font("ALGERIAN",Font.ITALIC,25));
		//	l8.setForeground(Color.BLUE);
			pn1.add(l8);
			
			b6=new JButton("  ?  ");
			b6.setBackground(Color.GREEN);
			pn1.add(b6);
			
			
			l0=new JLabel("  ");
			l0.setFont(new Font("ALGERIAN",Font.BOLD,30));
			l0.setForeground(Color.BLACK);
			pn1.add(l0);
			
			t=new JTextArea(3,10);
			t.setBackground(Color.LIGHT_GRAY);
			pn1.add(t);
			
			b8=new JButton(" Comment ");
			b8.setBackground(Color.RED);
			pn1.add(b8);
			
	
	
			add(pn1);
			
			
			
			plant1 e=new plant1();
			b1.addActionListener(e);
			b2.addActionListener(e);
			b3.addActionListener(e);
			b4.addActionListener(e);
			b5.addActionListener(e);
			b6.addActionListener(e);
			b7.addActionListener(e);
			b8.addActionListener(e);
			
			
			
		}
		public class plant1 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==b1){
					l0.setText("<html>ALLAH has the importance of you as much as<br> you have the importance of ALLAH</html>");
				}else if(e.getSource()==b2){
					l0.setText("<html>the more you give importance The Holy quran<br> the more important you will be</html>");
				}
				else if(e.getSource()==b3){
					l0.setText("the men who were dissatisfied by you for ALLAH");
				}else if(e.getSource()==b4){
					l0.setText("<html>the belief of those things<br> which were vanished for the sake of <br> pure beleief of ALLAH</html>");
				}
				else if(e.getSource()==b5){
					l0.setText("<html>They are polite with muslims <br>and hard with disbelievers</html>");
				}else if(e.getSource()==b6){
					l0.setText("By salat in jamat and pabondi of sunnat");
				}
				else if(e.getSource()==b7){
					l0.setText("Love of Dunia and fear of death");
				}else if(e.getSource()==b8){
					l0.setText("<html>Thanks...but here your coment is rejected<br>these words are true<br>we don't care of your praise or comment</html> ");
					t.setText("");
				}
				
		}
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Do_U_Wanna_Know ok=new Do_U_Wanna_Know();
		ok.Engine();
		ok.setVisible(true);
		ok.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ok.setSize(1000,700);
		ok.setTitle(" MESSAGE ");
		
		
	}

	
}
