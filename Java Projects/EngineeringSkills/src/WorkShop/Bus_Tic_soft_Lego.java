package WorkShop;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Bus_Tic_soft_Lego extends JFrame{
	private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
	private JTextField text1,text2,text3;
	private JButton button1,button2,button3;
	public void go(){
		
		setLayout(new FlowLayout());
		
		label1=new JLabel("ENTER \n1.KAPTAI TO SAIDABAD : 550/=\n2.KAPTAI TO KOLLANPUR : 550/=\n3.KAPTAI TO RAJSHAHI : 950/=\n ");
		add(label1);
		
		label2=new JLabel("ENTER \n1.KAPTAI TO SAIDABAD : 550/=\n2.KAPTAI TO KOLLANPUR : 550/=\n3.KAPTAI TO RAJSHAHI : 950/=\n ");
		add(label2);

		text1=new JTextField(3);
		add(text1);
		
		button1=new JButton(" OK ");
		add(button1);
		
		Event1 e=new Event1();
		button1.addActionListener(e);
		
		label2=new JLabel("");
		add(label2);
		
		
	}
	
	public class Event1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Bus_Tic_soft_Lego ob =new Bus_Tic_soft_Lego();
			int m=(int)(Double.parseDouble(text1.getText()));
			 ob.SeatPlan();
			int k;
		
			switch(m){
			case 1:
				k=550;
				ob.bus_1(k);
				break;
			case 2:
				k=550;
				ob.bus_2(k);
				break;
			case 3:
				k=950;
				ob.bus_3(k);
				break;
			default:
				label3.setText("ILLEAGAL EXCESS !!!");
			}
		}
			
		}
			
		
		
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus_Tic_soft_Lego ob=new Bus_Tic_soft_Lego();
		ob.go();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 ob.setSize(500,500);
	     ob.setTitle("...DHUMKETU EXPRESS...");
	     ob.setVisible(true);
	}

	public void bus_3(int k) {
		// TODO Auto-generated method stub
		
	}

	public void bus_2(int k) {
		// TODO Auto-generated method stub
		
	}

	public void bus_1(int k) {
		// TODO Auto-generated method stub
		
	}

	public void SeatPlan() {
		// TODO Auto-generated method stub
		label4.setText("DOOR\tDRIVER");
		for(int i=0;i<10;i++){
			for(int j=1;j<=4;j++){
				if(j==3){
			label5.setText(" \t ");
		}
				String s=Integer.toString(65+i);
				String v=Integer.toString(j);
				label5.setText(s);
				label5.setText(v);
		}
			label5.setText("\n");
	}
		
	}

}
