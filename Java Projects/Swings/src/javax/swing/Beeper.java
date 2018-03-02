package javax.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Beeper extends JFrame{
		private JButton button;
		private JLabel label;
		int c=0;
		int x=0;
		String s;
		public void go(){
			setLayout(new FlowLayout());
			
			button=new JButton("CLICK TO HERE A SOUND");
			add(button);
			
			label=new JLabel("");
			add(label);
			
			Event e=new Event();
			button.addActionListener(e);
		}
		public class Event implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Toolkit.getDefaultToolkit().beep();
				c++;
				if(x==0){
					s="time";
				}else
					s="times";
				
				label.setText("You have clicked : "+c+" "+s);
			}
			
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beeper ob=new Beeper();
		ob.go();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setVisible(true);
		ob.setSize(300,300);
		ob.setTitle("Beeper");
	}

}
