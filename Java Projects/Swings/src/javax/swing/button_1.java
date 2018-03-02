package javax.swing;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.*;
import java.util.logging.Level;
public class button_1 implements ActionListener {
	 JButton button=new JButton("Change Color");
	 JButton labelButton=new JButton("Trigger");
	 JLabel label=new JLabel("I 'm Label");
	 JFrame frame=new JFrame("ROYAL MESSEGE");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button_1 gui=new button_1();
		gui.go();
	}
	public void go(){//why it needs extra function ???
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //for exit,minimize or boarden	
		button.addActionListener(new ColorListener());//registering button
		labelButton.addActionListener(new LabelListener());//registering labelButton
		MyDrawPanel obj=new MyDrawPanel();
		//frame.getContentPane().add(BorderLayout.EAST,button);
	    frame.getContentPane().add(BorderLayout.NORTH,label);	
		frame.getContentPane().add(BorderLayout.WEST,button);//setting position of button
		frame.getContentPane().add(BorderLayout.EAST,labelButton);//setting position lebelButton
		frame.getContentPane().add(BorderLayout.CENTER,obj);//setting position of the work
		frame.setSize(300,300);
		frame.setVisible(true);
		
		
		
	}

	
	class LabelListener implements ActionListener {

		/**
		 * @param args
		 */
		public void actionPerformed(ActionEvent event) {
			label.setText("A CALM SEA NEVER MAKE A SKILLED SAILOR");
			
		}

	}
	class ColorListener implements ActionListener{

		/**
		 * @param args
		 */
		 
			public void actionPerformed(ActionEvent event) {
				frame.repaint();
			}

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
