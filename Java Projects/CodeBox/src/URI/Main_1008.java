package URI;

import java.util.Scanner;

public class Main_1008 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		float p=0,r=0;
		Scanner ii=new Scanner(System.in);
		a=ii.nextInt();
		b=ii.nextInt();
		p=ii.nextFloat();
		r=b*p;
		System.out.println("NUMBER = "+a);
		System.out.printf("SALARY = U$ %.2f",r);

	}

}
