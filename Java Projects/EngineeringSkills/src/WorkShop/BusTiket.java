package WorkShop;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.util.Scanner;
public class BusTiket extends JFrame{
	 BusTiket g=new BusTiket();
	public JButton button1,button2,button3;
	public JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
	public JTextField text1,text2,text3;
		public int z=1,x=1,y=1;
		public int k=0;
		int p=0,m=0;
		char ch='0';
		public String[] SeatofBus_1=new String[40];
		public String[] SeatofBus_2=new String[40];
		public String[] SeatofBus_3=new String[40];
		public String[] Name=new String[20];
		public int[] Mobile=new int[11];
		static Scanner in=new Scanner(System.in);
		public void go(){
			setLayout(new FlowLayout());
			label1=new JLabel("ENTER \n1.KAPTAI TO SAIDABAD : 550/=\n2.KAPTAI TO KOLLANPUR : 550/=\n3.KAPTAI TO RAJSHAHI : 950/=\n ");
			add(label1);
			
			label2=new JLabel("CHOOSE A BUS : ");
			add(label2);
			
			text1=new JTextField(5);
			add(text1);
			
			button1=new JButton(" OK ");
			add(button1);
			
			Event1 e=new Event1();
			button1.addActionListener(e);
			
			label3=new JLabel("");
			add(label3);
			
			label4=new JLabel("");
			add(label4);
			
			label5=new JLabel("");
			add(label5);
			
			label6=new JLabel("");
			add(label6);
			
			label7=new JLabel("");
			add(label7);
			
			label8=new JLabel("");
			add(label8);
			
			label9=new JLabel(""); 
			add(label9);
			
			label10=new JLabel("");
			add(label10);
			
			
			
		}
		/**
		 * @param args
		 */
		public void SeatPlan(){
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
		void bus_1(int k){
			int d=0;
			if(x==40){
				label6.setText("NO VACANT SEAT");
			}else{
				label6.setText(" CHOICE A SEAT : ");
				
				SeatofBus_1[x]=in.nextLine();
				text2=new JTextField(5);
				add(text2);
				
				button2=new JButton(" OK ");
				add(button2);
				
				Event2 e=new Event2();
				button2.addActionListener(e);
				
				String f,h;
				
				for(int i=0;i<40;i++){
					f=SeatofBus_1[i];
					h=SeatofBus_1[x];
				if(f.compareTo(h)==0){
						label7.setText("SORRY SIR YOUR SEAT IS ALREADY BOOKED !!!!");
					break;
					}else{
						d=1;
					}
				}
				if(d==1){
				label7.setText("PLEASE CONFIRM 550/= ONLY ");
				int a=in.nextInt();
				if(a<k){
					label7.setText("PLEASE CONFIRM MORE  "+(550-a)+"/=");
					
				}else if(a==k){
					label7.setText("THANK YOH SIR YOUR SEAT IS CONFIRMED  ");
				}else if(a>k){
					label7.setText("PLEASE CONFIRM  ONLY 550/=  ");
				}
				label8.setText("PLEASE CONFIRM YOUR NAME SIR : ");
				Name[x]=in.nextLine();
				label9.setText("GIVE YOUR PHONE NUMBER : ");
				Mobile[x]=in.nextInt();
			}
			}
			x++;
		
		}
		void bus_2(int k){
			if(y==40){
				System.out.println("NO VACANT SEAT");
			}else{
				int d=0;
				
					System.out.print(" CHOICE A SEAT : ");
					
					SeatofBus_2[y]=in.nextLine();
					String q=in.nextLine();
					String f,h;
					
					
					for(int i=0;i<40;i++){
						f=SeatofBus_2[i];
						h=SeatofBus_2[y];
					if(f.compareTo(h)==0){
							System.out.println("SORRY SIR YOUR SEAT IS ALREADY BOOKED !!!!");
						break;
						}else{
							d=1;
						}
						
					}
					if(d==1){
					System.out.println("PLEASE CONFIRM 550/= ONLY ");
					int a=in.nextInt();
					if(a<k){
						System.out.println("PLEASE CONFIRM MORE  "+(550-a)+"/=");
						
					}else if(a==k){
						System.out.println("THANK YOH SIR YOUR SEAT IS CONFIRMED  ");
					}else if(a>k){
						System.out.println("PLEASE CONFIRM  ONLY 550/=  ");
					}
					System.out.println("PLEASE CONFIRM YOUR NAME SIR : ");
					Name[y]=in.nextLine();
					System.out.println("GIVE YOUR PHONE NUMBER : ");
					Mobile[y]=in.nextInt();
				}
				}
				
			
			
			y++;
			
		}
		void bus_3(int k){
			if(z==40){
				System.out.println("NO VACANT SEAT");
			}else{
				int d=0;
				
					System.out.print(" CHOICE A SEAT : ");
					
					SeatofBus_3[z]=in.nextLine();
					String q=in.nextLine();
					String f,h;
					
					
					for(int i=0;i<40;i++){
						f=SeatofBus_3[i];
						h=SeatofBus_3[z];
					if(f.compareTo(h)==0){
							System.out.println("SORRY SIR YOUR SEAT IS ALREADY BOOKED !!!!");
						break;
						}else{
							d=1;
						}
						
					}
					if(d==1){
					System.out.println("PLEASE CONFIRM 550/= ONLY ");
					int a=in.nextInt();
					if(a<k){
						System.out.println("PLEASE CONFIRM MORE  "+(550-a)+"/=");
						
					}else if(a==k){
						System.out.println("THANK YOH SIR YOUR SEAT IS CONFIRMED  ");
					}else if(a>k){
						System.out.println("PLEASE CONFIRM  ONLY 550/=  ");
					}
					System.out.println("PLEASE CONFIRM YOUR NAME SIR : ");
					Name[z]=in.nextLine();
					System.out.println("GIVE YOUR PHONE NUMBER : ");
					Mobile[z]=in.nextInt();
				}
				}
			
			
			z++;
			
		}

	/**
	 * @param args
	 */
		public class Event1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			 m=(int)(Double.parseDouble(text1.getText()));
			 g.SeatPlan();
			switch(m){
			case 1:
				k=550;
				g.bus_1(k);
				break;
			case 2:
				k=550;
				g.bus_2(k);
				break;
			case 3:
				k=950;
				g.bus_3(k);
				break;
			default:
				label3.setText("ILLEAGAL EXCESS !!!");
			}
		}
			
		}
		public class Event2 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 BusTiket ob=new BusTiket();
     ob.go();
     ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     ob.setSize(1000,1000);
     ob.setTitle("...DHUMKETU EXPRESS...");
     ob.setVisible(true);

	}

}
