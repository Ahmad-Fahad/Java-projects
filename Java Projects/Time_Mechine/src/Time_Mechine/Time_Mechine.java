package Time_Mechine;


	 

	import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



	public class Time_Mechine extends JFrame {
		ButtonClicked t=new ButtonClicked();
		Thread th=new Thread(t);
		public static int x=0,y=0;
		private JButton start,stop,clear;
		private JLabel h1,h,l1,m1,m,l2,s1,s,l9,l0;
		public JTextField t1,t2,t3;
		 private ImageIcon im=new ImageIcon("timeRuns.gif");
		private JPanel p1=new JPanel();
		private JPanel p2=new JPanel();
		private JPanel p3=new JPanel();
		private JPanel p4=new JPanel();
		private JPanel p5=new JPanel();
		private JPanel p6=new JPanel();
		  
		public void action(){
			setLayout(new FlowLayout());
			
			 
			p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
			
			l0=new JLabel("");
			l0.setIcon(im);
			p5.add(l0);
			
			h=new JLabel("00");
			h.setFont(new Font("ALGERIAN",Font.BOLD,100));
			p2.add(h);
			 
			l1=new JLabel(" : ");
			l1.setFont(new Font("ALGERIAN",Font.BOLD,100));
			p2.add(l1);
		 
			m=new JLabel("00");
			m.setFont(new Font("ALGERIAN",Font.BOLD,100));
			p2.add(m);
			l2=new JLabel(" : ");
			l2.setFont(new Font("ALGERIAN",Font.BOLD,100));
			p2.add(l2);
			s=new JLabel("00");
			s.setFont(new Font("ALGERIAN",Font.BOLD,100));
			p2.add(s);
			
			start=new JButton(" Start ");
			start.setBackground(Color.LIGHT_GRAY);
			p3.add(start);
			stop=new JButton(" Stop ");
			stop.setBackground(Color.LIGHT_GRAY);
			p3.add(stop);
			clear=new JButton(" Clear ");
			clear.setBackground(Color.LIGHT_GRAY);
			p3.add(clear);
			 
			p1.add(p5);
			p1.add(p2);
			p1.add(p3);
			p1.add(p4);
			add(p1);
			
			ButtonClicked e=new ButtonClicked();
			start.addActionListener(e);
			stop.addActionListener(e);
			clear.addActionListener(e);
			
			
			
		}
		
		public  class ButtonClicked implements ActionListener,Runnable{
			 int x=0;
			  int y=0;
			
			public void actionPerformed(ActionEvent a) {
				// TODO Auto-generated method stub
				
				if(a.getSource()==start){
					x=1;
					 th.start();
				}else if(a.getSource()==stop){
					th.stop();
				}else if(a.getSource()==clear){
					 h.setText("00");
					 //h2.setText("0");
					 m.setText("00");
					 //m2.setText("0");
					 s.setText("00");
					 
				}
				
				
			}

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int k=1;k<12;k++){
				for(int j=0;j<60;j++){
					for(int i=0;i<60;i++){
						if(i<10 && j<10){
						s.setText(""+0+i);
						m.setText(""+0+j);
					}else if(i<10 && j>=10){
					s.setText(""+0+i+"");
					m.setText(""+j+"");
 				}else if(i>=10 && j<10){
				    s.setText(""+i+"");
				    m.setText(""+0+j+"");
				}else if(i>=10 && j>=10){
				s.setText(""+i+"");
				m.setText(""+j+"");
 				}
						try {
							th.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
			
				}
				h.setText(""+k);
				}
			 		
				
			
		}
		}

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Time_Mechine key =new  Time_Mechine();
			key.setDefaultCloseOperation(EXIT_ON_CLOSE);
			key.setVisible(true);;
			key.setSize(1500,750);
			key.action();
			 
			

		}

		 
	 
	}