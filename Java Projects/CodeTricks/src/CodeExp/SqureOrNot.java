package CodeExp;

import java.util.Scanner;

public class SqureOrNot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		double d;
		Scanner ii=new Scanner(System.in);
		m=ii.nextInt();
		d=Math.sqrt(m);
		n=(int)d;
		if(n==d){
			System.out.println(m+" is a squre number ");
		}else{
			System.out.println(m+" is not a squre number ");
		}

	}

}
