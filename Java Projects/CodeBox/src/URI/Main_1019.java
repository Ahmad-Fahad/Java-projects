package URI;

import java.util.Scanner;

public class Main_1019 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 int N=0;
	 Scanner ii=new Scanner(System.in);
	 N=ii.nextInt();
	 
	 int h=0,m=0,s=0,r=0;
	 
	 h=N/3600;
	 r=N%3600;
	 m=r/60;
	 s=r%60;
	 System.out.printf("%d:%d:%d\n",h,m,s);
	 
	 
			 

	}

}
