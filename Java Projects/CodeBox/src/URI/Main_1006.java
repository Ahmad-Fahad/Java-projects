package URI;

import java.util.Scanner;

public class Main_1006 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float A=0,B=0,C=0,m=0,n=0;
		Scanner i=new Scanner(System.in);
		A=i.nextFloat();
		B=i.nextFloat();
		C=i.nextFloat();
		m=(A*2)+(B*3)+(C*5);
		n=m/(2+3+5);
		System.out.printf("MEDIA = %.1f\n",n);
		

	}

}
