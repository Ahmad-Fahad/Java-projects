package URI;

import java.util.Scanner;

public class Main_1010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ii=new Scanner(System.in);
		int a,b,c,d;
		float x,y,z,u;
		a=ii.nextInt();
		b=ii.nextInt();
		x=ii.nextFloat();
		c=ii.nextInt();
		d=ii.nextInt();
		y=ii.nextFloat();
		z=(x*b)+(y*d);
		System.out.printf("VALOR A PAGAR: R$ %.2f",z);

	}

}
