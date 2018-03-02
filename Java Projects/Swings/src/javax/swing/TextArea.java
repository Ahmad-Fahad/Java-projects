package javax.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextArea extends JFrame{
	JTextArea area;
	JButton button;
	JLabel label;
	public TextArea(){
		setLayout(new FlowLayout());
		
		area=new JTextArea(3,20);
		add(area);
		
		button=new JButton("OK");
		add(button);
		
		label=new JLabel();
		add(label);
		
		Event e=new Event();
		button.addActionListener(e);
		
		
		
	}
	public class Event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String s=area.getText();
			if(s==null ? "" ==null : s.equals("")){
				label.setText("Please Enter Some Text ");
			}else{
			label.setText(s);
			}
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextArea ob=new TextArea();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setVisible(true);
		ob.setSize(300,240);
		ob.setTitle("Text Area");
	
	}

}
