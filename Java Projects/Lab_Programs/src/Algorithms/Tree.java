package Algorithms;

import DATA_STRUCTURE.Binary_Tree;

public class Binary_Tree {
	public static char[] INFO=new char[20];
	public static int[] LEFT=new int[20];
	public static int[] RIGHT=new int[20];
	public int[] STACK=new int[20];
	int TOP;
	static int ROOT; 
	static int AVAIL;
	
	public static void main(String args[]){
		Binary_Tree on=new Binary_Tree();
		
		INFO[0]='K';INFO[1]='C';INFO[2]='G';INFO[4]='A';INFO[5]='H';INFO[6]='L';INFO[9]='B';INFO[11]='F';INFO[12]='E';INFO[16]='J';INFO[17]='D';
		
		LEFT[0]=-1;LEFT[1]=-2;LEFT[2]=-1;LEFT[3]=13;LEFT[4]=9;LEFT[5]=16;LEFT[6]=-1;LEFT[7]=8;LEFT[8]=3;LEFT[9]=-17;LEFT[10]=18;LEFT[11]=-1;LEFT[12]=11;LEFT[13]=14;LEFT[14]=15;LEFT[15]=10;LEFT[16]=6;LEFT[17]=-1;LEFT[18]=19;
		LEFT[19]=-1;
		
		RIGHT[0]=-1;RIGHT[1]=5;RIGHT[2]=-1;RIGHT[4]=1;RIGHT[5]=0;RIGHT[6]=-1;RIGHT[9]=12;RIGHT[11]=-1;RIGHT[12]=-1;RIGHT[16]=-1;RIGHT[17]=-1;
		
		
		ROOT=4;
		AVAIL=7;
		
		System.out.println("\t\tBINSRY TREE (90 DEGREE ROTATED):\n\n");
		on.print(ROOT,0);
		
		System.out.println("\tPREORDER  :  ");
		on.preord();
		
		System.out.println("\tINORDER : ");
		on.inord();
		
		System.out.println("\tPOSTORDER : ");
		on.postord();
	}
	
	void tabs(char ch ,int n){
		for(int i=0;i<n;i++){
			System.out.print("ch");
		}
	}

	private void postord() {
		// TODO Auto-generated method stub
		
	}

	private void inord() {
		// TODO Auto-generated method stub
		int ptr;TOP=0;
		STACK[0]=-1;
		ptr=ROOT;
		//label:
		while(ptr!=-1){
			TOP=TOP+1;
			STACK[TOP]=ptr;
			ptr=LEFT[ptr];
		}
		ptr=STACK[TOP];
		TOP=TOP-1;
		while(ptr!=-1){
			System.out.print(INFO[ptr]);
			if(RIGHT[ptr]!=-1){
				ptr=RIGHT[ptr];
				//goto label;
			
				
			}
			ptr=STACK[TOP];
			TOP=TOP-1;
			
		}
		System.out.print("END");
	}

	private void preord() {
		// TODO Auto-generated method stub
		int ptr;TOP=0;
		STACK[0]=-1;
		ptr=ROOT;
		while(ptr!=-1){
			System.out.print(INFO[ptr]+"--->");
			if(RIGHT[ptr]!=-1){
				TOP=TOP+1;
				STACK[TOP]=RIGHT[ptr];
				
			}
			if(LEFT[ptr]!=-1){
				ptr=LEFT[ptr];
				
			}else{
				ptr=STACK[TOP];
				TOP=TOP-1;
			}
		}
		System.out.print("END");
	}

	private void print(int node, int level) {
		// TODO Auto-generated method stub
		Binary_Tree ok=new Binary_Tree();
		if(node==-1){
			ok.tabs(' ',level);
		}else{
			System.out.print(RIGHT[node]+(level+1));
			ok.tabs(' ',level);
			ok.tabs(' ',level);
			ok.tabs(' ',level);
			ok.tabs(' ',level);
			ok.tabs(' ',level);
			ok.tabs(' ',level);
			ok.tabs(' ',level);
			
			System.out.println(INFO[node]);
			System.out.println(LEFT[node]+(level+1));
			
		}
	}

}