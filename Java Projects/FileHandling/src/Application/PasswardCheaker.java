package Application;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class PasswardCheaker extends JFrame{
	String p;
	public JLabel l1,l2,l3,l4,l5;
	public JButton b1,b2,b3,b4;
	JPasswordField pf1,pf2;
	public void go(){
		setLayout(new FlowLayout());
		JPanel p1=new JPanel();
		p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
		JPanel p2=new JPanel();
		l1=new JLabel("Passward : ");
		p2.add(l1);
		pf1=new JPasswordField(8);
		pf1.setEchoChar('$');
		p2.add(pf1);
		b1=new JButton(" OK ");
		p2.add(b1);
		
		
		JPanel p3=new JPanel();
		l2=new JLabel("Re Enter Passward : ");
		p3.add(l2);
		  pf2=new JPasswordField(8);
		pf2.setEchoChar('#');
		p3.add(pf2);
		b2=new JButton(" OK ");
		
		JPanel p4=new JPanel();
		l3=new JLabel(" ");
		p4.add(l3);
		
		p3.add(b2);
		p1.add(p2);
		p1.add(p3);
		p1.add(p4);
		
		add(p1);
		
		welldone w=new welldone();
		b1.addActionListener(w);
		 b2.addActionListener(w);
	}
	public class welldone implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==b1){
				p=pf1.getText();
				
				
			}else if(e.getSource()==b2){
				String h=pf2.getText();
				if(h.equals(p)){
					l3.setText(" Your passward is correct ");
				}else{
					l3.setText("Your passward is wrong");
				}
			}
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswardCheaker key=new PasswardCheaker();
		key.setDefaultCloseOperation(EXIT_ON_CLOSE);
		key.setVisible(true);;
		key.setSize(700,500);
		key.go();

	}

}
