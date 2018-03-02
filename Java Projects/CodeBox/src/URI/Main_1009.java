package URI;

import java.util.Scanner;

public class Main_1009 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="";
			double a=0,b=0,x=0,y=0;
			Scanner ii=new Scanner(System.in);
			s=ii.nextLine();
			a=ii.nextDouble();
			b=ii.nextDouble();
			y=b*15/100;
			x=a+y;
			System.out.printf("TOTAL = R$ %.2f\n",x);
	}

}
