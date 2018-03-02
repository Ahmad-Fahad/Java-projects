package OpenningWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainW extends JFrame{
	public JButton b1;
	public void go(){
		b1=new JButton(" new Winodw ");
		add(b1);
		
		eff e =new eff();
		b1.addActionListener(e);
		
	}
	public class eff implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			HelpW ke= new HelpW();
			ke.setSize(700,500);
			ke.setVisible(true);
			 dispose();//new window ti pre er upor overlap hobe
			
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainW key=new MainW();
		key.setDefaultCloseOperation(EXIT_ON_CLOSE);
		key.setVisible(true);;
		key.setSize(700,500);
		key.go();

	}

}
