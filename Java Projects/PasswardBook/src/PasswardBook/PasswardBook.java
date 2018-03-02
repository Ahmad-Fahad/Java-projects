package PasswardBook;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PasswardBook extends JFrame{
	public JButton b1,b2,b3,b4;
	public void Main(){
		//setLayout(new BorderLayout());
		JPanel pmain=new JPanel();
		JPanel pn=new JPanel();
		JPanel ps=new JPanel();
		JPanel pe=new JPanel();
		JPanel pw=new JPanel();
		
		b1=new JButton(" Create Account ");
		pn.add(b1);
		
		
		b2=new JButton(" Log  in ");
		ps.add(b2);
		
		pmain.add(pn);
		pmain.add(ps);
		add(pmain);
		
		login a=new login();
		b1.addActionListener(a);
		b2.addActionListener(a);
		
		
		
	}
	public class login implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==b2){
				Login k=new Login();
				k.setSize(800,550);
				k.setVisible(true);
				k.setDefaultCloseOperation(EXIT_ON_CLOSE);
				dispose();

				
			}else if(e.getSource()==b1){
				
			}
			
			
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswardBook key=new PasswardBook();
		key.setDefaultCloseOperation(EXIT_ON_CLOSE);
		key.setVisible(true);
		key.setSize(800,550);
		key.Main();
		

	}

}
