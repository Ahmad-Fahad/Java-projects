package javax.swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class GridbagLayout extends JFrame{
	
	public void go(){
		setLayout(new GridBagLayout());
		
		JButton btn=new JButton("Button1");
		JLabel btn1=new JLabel("Button2");
		JButton btn2=new JButton("Button3");
		JButton btn3=new JButton("Button4");
		
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		add(btn,gbc);
		
		
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx=1;
		gbc.gridy=0;
		add(btn1,gbc);
		
		
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx=1;
		gbc.gridy=1;
		add(btn2,gbc);
		
		
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=1;
		add(btn3,gbc);
		
		
		
	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridbagLayout key=new GridbagLayout();
		key.go();
		key.setSize(800,600);
		key.setDefaultCloseOperation(EXIT_ON_CLOSE);
		key.setVisible(true);

	}

}
