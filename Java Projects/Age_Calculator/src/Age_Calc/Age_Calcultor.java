package Age_Calc;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Age_Calcultor extends JFrame{
	private JLabel l1,l2,l3,l4,l5;
	private JButton b1,b2,b3,b4;
	private JTextField t1,t2,t3,t4;
	private JComboBox c1=new JComboBox();;
	private JComboBox c2=new JComboBox();;
	
	public void go(){
		setLayout(new FlowLayout());
		 	
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel p5=new JPanel();
		JPanel p6=new JPanel();
		JPanel p7=new JPanel();
		JPanel p8=new JPanel();
		JPanel pc=new JPanel();
		JPanel pb=new JPanel();
		
		String com[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		for(int i=0;i<com.length;i++){
			c1.addItem(com[i]);
			c2.addItem(com[i]);
			c1.setMaximumRowCount(6);
			c2.setMaximumRowCount(6);
			pc.add(c1);
			pb.add(c2);
			
		}
		
		p4.setLayout(new BoxLayout(p4,BoxLayout.Y_AXIS));
		p5.setLayout(new BoxLayout(p5,BoxLayout.Y_AXIS));
	
		p1.setLayout(new FlowLayout());
		
		l1=new JLabel("Current Date");
		l1.setFont(new Font("ALGERIAN",Font.BOLD,35));
		l1.setForeground(Color.BLUE);
		p4.add(l1);
		
		l1=new JLabel("Date : ");
		l1.setFont(new Font("ALGERIAN",Font.BOLD,25));
		p1.add(l1);
		
		t1=new JTextField(4);
		t1.setFont(new Font("ALGERIAN",Font.BOLD,25));
		p1.add(t1);
		
		l1=new JLabel("Month : ");
		l1.setFont(new Font("ALGERIAN",Font.BOLD,25));
		p1.add(l1);
		

		p1.add(pc);
		
		l1=new JLabel("Year : ");
		l1.setFont(new Font("ALGERIAN",Font.BOLD,25));
		p1.add(l1);
		
		t2=new JTextField(6);
		t2.setFont(new Font("ALGERIAN",Font.BOLD,25));
		p1.add(t2);
		
		p3.setLayout(new BoxLayout(p3,BoxLayout.Y_AXIS));
		
		l1=new JLabel("Birth Date");
		l1.setFont(new Font("ALGERIAN",Font.BOLD,35));
		l1.setForeground(Color.BLUE);
		p3.add(l1);
		
		l1=new JLabel("Date : ");
		l1.setFont(new Font("ALGERIAN",Font.BOLD,25));
		p2.add(l1);
		
		t3=new JTextField(4);
		t3.setFont(new Font("ALGERIAN",Font.BOLD,25));
		p2.add(t3);
		
		l1=new JLabel("Month : ");
		l1.setFont(new Font("ALGERIAN",Font.BOLD,25));
		p2.add(l1);
		
		
		p2.add(pb);
		
		l1=new JLabel("Year : ");
		l1.setFont(new Font("ALGERIAN",Font.BOLD,25));
		p2.add(l1);
		
		t4=new JTextField(6);
		t4.setFont(new Font("ALGERIAN",Font.BOLD,25));
		p2.add(t4);
		
		b1=new JButton(" OK ");
		b1.setFont(new Font("ALGERIAN",Font.BOLD,25));
		b1.setBackground(Color.LIGHT_GRAY);
		p6.add(b1);
		
		b2=new JButton(" Clear ");
		b2.setFont(new Font("ALGERIAN",Font.BOLD,25));
		b2.setBackground(Color.LIGHT_GRAY);
		p6.add(b2);
		
		calcu e=new calcu();
		b1.addActionListener(e);
		b2.addActionListener(e);
		
		l2=new JLabel("");
		l2.setFont(new Font("ALGERIAN",Font.BOLD,40));
		l2.setForeground(Color.RED);
		p7.add(l2);
		
		l3=new JLabel("");
		l3.setFont(new Font("ALGERIAN",Font.BOLD,35));
		l3.setForeground(Color.BLUE);
		p8.add(l3);
		
		
		p4.add(p1);
		p3.add(p2);
		p5.add(p4);
		p5.add(p3);
		p5.add(p6);
		p5.add(p7);
		p5.add(p8);
		add(p5);
		
		/*
		p1.setBackground(Color.GREEN);
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.GREEN);
		p4.setBackground(Color.GREEN);
		p5.setBackground(Color.GREEN);
		p6.setBackground(Color.GREEN);
		p7.setBackground(Color.GREEN);
		p8.setBackground(Color.GREEN);
		
		*/
		
		
	}
	
	public class calcu implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent a) {
			// TODO Auto-generated method stub
			if(a.getSource()==b1){
				int cd=0,cm=0,cy=0,bd=0,bm=0,by=0,rd=0,rm=0,ry=0;
				
				cd=(int)(Double.parseDouble(t1.getText()));
				cy=(int)(Double.parseDouble(t2.getText()));
				bd=(int)(Double.parseDouble(t3.getText()));
				by=(int)(Double.parseDouble(t4.getText()));
				cm=c1.getSelectedIndex()+1;
				bm=c2.getSelectedIndex()+1;
				if(by>cy){
					l2.setText("Invalid Birth Year");
				}else{
				if(bd>cd){
					cd=cd+30;
					bm=bm+1;
				}
				if(bm>cm){
					cm=cm+12;
					by=by+1;
				}
				
				rd=cd-bd;
				rm=cm-bm;
				ry=cy-by;
				
				int leapYear=ry/4;
				rd=rd+leapYear;
				
				if(rd>30){
					rm=rm+1;
					rd=rd-30;
				}
				
				l2.setText("Your Age is : "+ry+" Years,   "+rm+" Months,  "+rd+" Days ...!!!");
				l3.setText("<html>the more your age is increasing<br>the more you are becoming near to death<br>so come back to islam <br>and take preparation for death</html>");
			
				}
			}else if(a.getSource()==b2){
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				l2.setText("");
				l3.setText("");
			}
			
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age_Calcultor key=new Age_Calcultor();
		key.go();
		key.setSize(1200,700);
		key.setTitle("Age Calculator");
		key.setDefaultCloseOperation(EXIT_ON_CLOSE);
		key.setVisible(true);
		

	}

}
