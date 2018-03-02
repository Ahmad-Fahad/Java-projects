import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class buttonFrame extends JFrame{
	/**
	 * @param args
	 */
	private JButton plainbutton;
	private JButton fancybutton;
	public buttonFrame(){
		super("Testing buttons");
		setLayout(new FlowLayout());
		
		plainbutton=new JButton("Plain Button");
		add(plainbutton);
		//Icon bug1=new ImageIcon(getClass().getResource(bug1.gif));
		//Icon bug2=new ImageIcon(getClass().getResource(bug2.gif));
		 //fancybutton=new JButton("Fancy button",bug1);
		 //fancybutton.setRolloverIcon(bug2);
		 add( fancybutton);
		 ButtonHandler handler=new ButtonHandler();
		 fancybutton.addActionListener(handler);
		 plainbutton.addActionListener(handler);
	}
	public class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(buttonFrame.this,String.format("You pressed : %s",event.getActionCommand()));
				
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buttonFrame obj=new buttonFrame();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(275,110);
		obj.setVisible(true);
		

	}

	}	

			

	




