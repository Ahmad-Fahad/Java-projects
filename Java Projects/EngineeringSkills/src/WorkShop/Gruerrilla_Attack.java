package WorkShop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gruerrilla_Attack extends JFrame{
	private JButton b1;
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
	private ImageIcon t=new ImageIcon("gier.gif");
	private ImageIcon d=new ImageIcon("dish.gif");
	private ImageIcon f=new ImageIcon("realBlust.gif");
	private ImageIcon b=new ImageIcon("e.gif");
	private ImageIcon h=new ImageIcon("go.gif");
	private ImageIcon a=new ImageIcon("gr.gif");
	private ImageIcon p=new ImageIcon("f.gif");
	private ImageIcon r=new ImageIcon("r.gif");
	private ImageIcon cm=new ImageIcon("dozer.gif");
	private ImageIcon pt=new ImageIcon("Bailout.gif");
	private ImageIcon c=new ImageIcon("p.gif");
	private ImageIcon go=new ImageIcon("go2.gif");
	
	public void go(){
		setLayout(new BorderLayout());
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel p5=new JPanel();
		JPanel p6=new JPanel();
		
		
		
		l2=new JLabel(p);
		p1.add(l2);
		l1=new JLabel(d);
		p1.add(l1);
		
		l3=new JLabel(h);
		p1.add(l3);
		
		add(p1,BorderLayout.NORTH);
		
		
	//	p3.setLayout(new BoxLayout(p3,BoxLayout.Y_AXIS));
		
		l4=new JLabel(cm);
		p3.add(l4);
		
		
		
		l6=new JLabel(r);
		p3.add(l6);
		
		add(p3,BorderLayout.CENTER);
		
		
		
		p4.setLayout(new BoxLayout(p4,BoxLayout.Y_AXIS));
		
		l8=new JLabel(c);
		p4.add(l8);
		
		l0=new JLabel(pt);
		p4.add(l0);
		
		add(p4,BorderLayout.WEST);
		
		
		
		l9=new JLabel(go);
		p5.add(l9);
		add(p5,BorderLayout.EAST);
		

		
		
		
		
		
		

		l7=new JLabel(a);
		p2.add(l7);
		
		
		b1=new JButton(" Triger ");
		b1.setBackground(Color.red);
		p2.add(b1);
		add(p2,BorderLayout.SOUTH);
		
		blust v=new blust();
		b1.addActionListener(v);
		
	}

		public class blust implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				l1.setIcon(f);
				l9.setIcon(h);
				l0.setIcon(pt);
				l8.setIcon(p);
				l3.setIcon(go);
				l2.setIcon(c);
			}
			
		}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gruerrilla_Attack key=new Gruerrilla_Attack();
		key.go();
		key.setTitle("Gruerrilla Attack");
		key.setVisible(true);
		key.setDefaultCloseOperation(EXIT_ON_CLOSE);
		key.setSize(1500,500);

	}

}
