package PasswardBook;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame{
	public JButton ok,clear;
	public JLabel l1,l2,l7,l3,l4,l5,l6;
	public JTextField t1,t2;
	
	public  Login(){
		 setLayout(new FlowLayout());
		JPanel pm=new JPanel();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		l1=new JLabel("Account Name : ");
		p1.add(l1);
		t1=new JTextField(5);
		p1.add(t1);
		l2=new JLabel("Passward : ");
		p1.add(l2);
		t2=new JTextField(8);
		p1.add(t2);
		
		ok=new JButton(" Enter ");
		p2.add(ok);
		
		clear=new JButton(" Clear ");
		p2.add(clear);
		
		p1.add(p2);
		add(p1);
		
		Buttonclicked a=new Buttonclicked();
		ok.addActionListener(a);
		clear.addActionListener(a);
		
		
		
	}
	public class Buttonclicked implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==ok){
				
			}else if(e.getSource()==clear){
				t1.setText("");
				t2.setText("");
			}
			
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login k=new Login();
		k.setDefaultCloseOperation(EXIT_ON_CLOSE);
		k.setVisible(true);;
		k.setSize(800,550);
	 
		

	}

}
