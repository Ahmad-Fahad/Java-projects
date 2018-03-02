package URI;

import java.util.Scanner;

public class Main_1020 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] time={365,30,1};
		int[] reslt=new int[3];
		
		int n,t=0;
		Scanner ii=new Scanner(System.in);
		n=ii.nextInt();
		for(int i=0;i<3;i++){
			reslt[i]=n/time[i];
			n=n%time[i];
		}
		 
		System.out.println(reslt[0]+" ano(s)");
		System.out.println(reslt[1]+" mes(es)");
		System.out.println(reslt[2]+" dia(s)");
		 
	}

}
