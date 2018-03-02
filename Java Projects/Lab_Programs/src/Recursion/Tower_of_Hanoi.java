package Recursion;

import java.util.Scanner;

public class Tower_of_Hanoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner in=new Scanner(System.in);
		Tower_of_Hanoi ob=new Tower_of_Hanoi();
		N=in.nextInt();
		if(N<1){
			System.out.println("INCORRECT VALUE ...!!!");
		}else{
			System.out.println("The following moves are requried for : "+N);
			 ob.TOWER(N,"BEG","AUX","END");
		}

	}
	
	public void TOWER(int N,String a,String b,String c){
		if(N==1){
			System.out.println(a+"--->"+c);
			return;
		}
		 TOWER(N-1,a,c,b);
		 System.out.println(a+"--->"+c);
		 TOWER(N-1,b,a,c);
		
	}

}
