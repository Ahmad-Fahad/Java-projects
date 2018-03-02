package URI;

import java.util.Scanner;

public class Main_1046 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0,e=0,n,r = 0;
		Scanner ii=new Scanner(System.in);
		s=ii.nextInt();
		e=ii.nextInt();
	 
			n=24-s;
			r=n+e;
			if(r>24){
				r=r-24;
			}
			System.out.println(r);
		 
		

	}

}
