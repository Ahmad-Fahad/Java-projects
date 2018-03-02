package Linked_List;
import java.util.Scanner;
public class InsertSorted {
	public static int[] LINK=new int[20];
	public static int[] LIST=new int[20];
	public static int START=11,AVAIL;
	public static int p=START;
	public int y=0;
	public int x=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		LIST[0]=22;LIST[2]=5;LIST[3]=19;LIST[5]=87;LIST[7]=29;LIST[8]=79;LIST[9]=33;LIST[11]=2;LIST[13]=50;LIST[14]=8;LIST[16]=55;LIST[18]=99;
		LINK[0]=3;LINK[2]=13;LINK[3]=2;LINK[5]=8;LINK[7]=14;LINK[8]=9;LINK[9]=18;LINK[11]=16;LINK[13]=5;LINK[14]=-1;LINK[16]=0;LINK[18]=7;
		//START=11;
		AVAIL=1;
		p=START;
		System.out.println("Initial List .........");
		while(p!=-1){
			System.out.println(LIST[p]+"\t");
			p=LINK[p];
		}
		System.out.println("Enter the item which you want to insert : ");
		int ITEM=in.nextInt();
		int LOC=FINDA(ITEM);
		INSLOC(ITEM,LOC);
		
		p=START;
		System.out.println("Modified List : ");
		while(p!=-1){
			System.out.println(LIST[p]+"\t");
			p=LINK[p];
		}

	}
	private static void INSLOC(int I, int L) {
		// TODO Auto-generated method stub
		
		int NEW ;
		if(AVAIL==-1){
			System.out.println("OVERFLOW ");
	
		}
		NEW=AVAIL;
		AVAIL=LINK[AVAIL];
		LIST[NEW]=I;
		if(L==-1){
			LINK[NEW]=START;
			START=NEW;
			
		}else{
			LINK[NEW]=LINK[L];
			LINK[L]=NEW;
			
		}
		
	}
	private static int FINDA(int I) {
		// TODO Auto-generated method stub
		int L,SAVE,p;
		if(START==-1){
			L=-1;
			return L;
		}
		if(I<LIST[START]){
			L=-1;
			return L;
		}
		SAVE=START;
		p=LINK[START];
		while (p!=-1) {
			if(I<LIST[p]){
				L=SAVE;
				return L;
				
			}
			SAVE=p;
			p=LINK[p];
			L=SAVE;
			return SAVE;
			
		}
		return 0;
	}

}
