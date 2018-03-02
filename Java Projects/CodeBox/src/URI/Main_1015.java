package URI;

import java.util.Scanner;

public class Main_1015 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1=0,x2=0,y1=0,y2=0,n=0,m=0,r=0;
		Scanner ii=new Scanner(System.in);
		x1=ii.nextDouble();
		y1=ii.nextDouble();
		x2=ii.nextDouble();
		y2=ii.nextDouble();
		n=(x2-x1)*(x2-x1);
		m=(y2-y1)*(y2-y1);
		r=n+m;
		r=Math.sqrt(r);
		System.out.printf("%.4f",r);

	}

}
