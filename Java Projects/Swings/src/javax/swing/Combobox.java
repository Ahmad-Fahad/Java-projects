package javax.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Combobox extends JFrame {
	
	String s[]={"Bus","Truck","C.N.G","Plane","Helicopter"};
	JLabel l;
	JComboBox c1;
	public void go(){
		setLayout(new FlowLayout());
		JPanel p1=new JPanel();
		c1=new JComboBox();
		for(int i=0;i<5;i++){
			c1.addItem(s[i]);
			c1.setEditable(true);
			c1.setMaximumRowCount(4);
			p1.add(c1);
		}
		
		
		JButton b=new JButton(" Show ");
		p1.add(b);
		
		l=new JLabel("");
		p1.add(l);
		
		add(p1);
		
		eff i=new eff();
		b.addActionListener(i);
		

	}
	
	public class eff implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String s= (String) c1.getItemAt(c1.getSelectedIndex());
			int n=c1.getSelectedIndex();
			l.setText(s+"   "+n);
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combobox key=new Combobox();
		//JFrame f1=new JFrame();
		key.go();
		key.setSize(800,600);
		key.setTitle("Age Calculator");
		key.setDefaultCloseOperation(EXIT_ON_CLOSE);
		key.setVisible(true);
		
		
	}

}
