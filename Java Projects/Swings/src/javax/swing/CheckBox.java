package javax.swing;
import javax.swing.*;
import java.applet.*;
import java.awt.GridLayout;
import java.awt.event.*;
public class CheckBox extends JFrame{

	private JCheckBox button1;
	private JCheckBox button2;
	private JLabel label1;
	private JLabel label2;
	
	public void go(){
		
		setLayout(new GridLayout(2,2));
		
	button1=new JCheckBox("Click to show Message 1 ");
	add(button1);
	
	button2=new JCheckBox("Click to show Message 2 ");
	add(button2);
		
		label1=new JLabel("");
		add(label1);
		
		label2=new JLabel("");
		add(label2);
		
		Event1 e=new Event1();
		button1.addItemListener(e);
		button2.addItemListener(e);
		
		
		
	}
	
	public class Event1 implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(button1.isSelected()){
			label1.setText("A CALM SEA NEVER MAKE AS SKILLED SAILOR");
		}else{
			label1.setText("");
		}
			if(button2.isSelected()){
				label2.setText("WIN OR DIE");
			}
				else{
					label2.setText("");
				}
			}
	
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox ob=new CheckBox();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.go();
		ob.setSize(300,300);
		ob.setTitle("Message");
		ob.setVisible(true);
		
	}

}
