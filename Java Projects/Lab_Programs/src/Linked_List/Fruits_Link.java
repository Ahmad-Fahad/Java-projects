package Linked_List;
import java.util.Scanner;
public class Fruits_Link {
/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] LINK=new int[20];
		String[] LIST=new String[10];
		LIST[1]="mango";LIST[2]="orange";LIST[3]="apple";LIST[4]="banana";LIST[5]="jackfruit";
		LINK[3]=4;LINK[4]=5;LINK[5]=1;LINK[1]=2;LINK[2]=0;
		//System.out.println("ENTER A NUMBER : ");
		int START=3;
		int AVAIL=1,p=0;
		p=START;
		while(p!=0){
			System.out.println(LIST[p]);
			p=LINK[p];
		
		}
	}
	}


