package javax.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class NewConcept extends JFrame{
	private JLabel label2;
	private JButton button2;
	private JButton button3;
	private JLabel label1;
	private JLabel label3;
	private JButton button1;
	private ImageIcon image1;
	private ImageIcon image2;
	private JTextField textfield;
	private int x=0;
	private int y=0;
	public void go(){
		setLayout(new FlowLayout());
		
		
		
		button1=new JButton("A");
		add(button1);
		
		Event1 e=new Event1();
		button1.addActionListener(e);
		
		
		button2=new JButton("B");
		add(button2);
		
		Event2 ev=new Event2();
		button2.addActionListener(ev);
		
		button3=new JButton("C");
		add(button3);
		
		Event3 eve=new Event3();
		button3.addActionListener(eve);
		
		label3=new JLabel();
		add(label3);
		
		label2=new JLabel();
		add(label2);
		
		
		
		label1=new JLabel();
		add(label1);
		
		
		
	}
	
	public class Event1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(x==0){
			label1.setText("\nyou clicked A");
			x=1;
			}else if(x==1){
				label1.setText("");
				x=0;
			}
		}
		
	}
	public class Event2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent ev) {
			// TODO Auto-generated method stub
			if(y==0){
			label2.setText("\nyou clicked B");
			y=1;
			}
			else if(y==1){
				label2.setText("");
				y=0;
			}
		}
		
	}
	
	public class Event3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent eve) {
			// TODO Auto-generated method stub
			label3.setText("Comments");
			textfield=new JTextField(50);
			add(textfield);
			
		}
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewConcept ob=new NewConcept();
		ob.go();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setSize(500,300);
		ob.setTitle("Title");
	   
		ob.setVisible(true);
		

	}


}
