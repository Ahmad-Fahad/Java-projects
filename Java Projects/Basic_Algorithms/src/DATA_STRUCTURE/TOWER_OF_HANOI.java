package DATA_STRUCTURE;

import java.util.Scanner;

public class TOWER_OF_HANOI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
			TOWER_OF_HANOI on=new TOWER_OF_HANOI ();
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the number of Disks :");
			int i=in.nextInt();
			if(i<1){
				System.out.println("\nINVALID INPUT \n");
			}else{
				//System.out.println("\nENTER THE NUMBER OF DISKS :  \n");
				int j=in.nextInt();
				on.TOWER(j,"BEG","AUS","END");//A,B,C
			}
			
	}

	private void TOWER(int j, String string, String string2, String string3) {
		// TODO Auto-generated method stub
		if(j==1){
			System.out.println(string+" --> "+string3);
			return;
		}else{
			TOWER(j-1,string,string3,string2);//A,C,B
			System.out.println(string+" --> "+string3);
			TOWER(j-1,string2,string,string3);//B,A,C
			return;
		}
	}

}
