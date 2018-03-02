package Bus_Tiket;
import java.util.Scanner;
public class Bus_Tike_1 {
	public int z=1,x=1,y=1;
	public String[] SeatofBus_1=new String[40];
	public String[] SeatofBus_2=new String[40];
	public String[] SeatofBus_3=new String[40];
	public String[] Name=new String[20];
	public int[] Mobile=new int[11];
	static Scanner in=new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public void SeatPlan(){
		System.out.println("DOOR\tDRIVER");
		for(int i=0;i<10;i++){
			for(int j=1;j<=4;j++){
				if(j==3){
			System.out.print(" \t ");
		}
				System.out.printf("%c%d ",(65+i),j);
		}
			System.out.println();
	}
		
	}
	void bus_1(int k){
		int d=0;
		if(x==40){
			System.out.println("NO VACANT SEAT");
		}else{
			System.out.print(" CHOICE A SEAT : ");
			
			SeatofBus_1[x]=in.nextLine();
			String q=in.nextLine();
			String f,h;
			
			
			for(int i=0;i<40;i++){
				f=SeatofBus_1[i];
				h=SeatofBus_1[x];
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
			Name[x]=in.nextLine();
			System.out.println("GIVE YOUR PHONE NUMBER : ");
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus_Tike_1 ob=new Bus_Tike_1();
		
		int k=0;
		int p=0,m=0;
		char ch='0';
		
		for(int s=0;s<120;s++){
		System.out.println("..ULKA EXPRESS.. ");
		System.out.print("ENTER \n1.KAPTAI TO SAIDABAD : 550/=\n2.KAPTAI TO KOLLANPUR : 550/=\n3.KAPTAI TO RAJSHAHI : 950/=\n ");
		System.out.println("CHOICE A BUS : ");
		 m=in.nextInt();
		 ob.SeatPlan();
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
			System.out.println("ILLEAGAL EXCESS !!!");
		}
	}
  }
}