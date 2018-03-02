package javax.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout_Manager extends JFrame{

	
	private static final Color RED = null;
	private JLabel kotha,alap;
	private JButton key,kat;
	private void go(){
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		
	
		//Layout_Manager ok=new Layout_Manager(); me
		
		alap=new JLabel("");
		for(int i=0;i<10;i++){
			key=new JButton("Switch "+i);
			add(key);
		}
		Effect e=new Effect();
		key.addActionListener(e);
		
	}
	private void in(){
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		kotha=new JLabel("A switch will be better for you ");
		add(kotha);
		
		kat=new JButton("Press me");
		kat.setBounds(500,500,70,60);
		add(kat);
	}
	public class Effect implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			alap.setText("You are lucky");
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout_Manager ob=new Layout_Manager();
		ob.go();
		ob.in();
		ob.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ob.setSize(800,900);
		ob.setVisible(true);
		ob.setTitle(" Press a Switch ");
	}

}
