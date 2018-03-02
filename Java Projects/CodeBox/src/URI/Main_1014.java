package URI;

import java.util.Scanner;

public class Main_1014 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X=0;
		float Y=0,r=0;
		Scanner ii=new Scanner(System.in);
		X=ii.nextInt();
		Y=ii.nextFloat();
		r=(float)X/Y;
		System.out.printf("%.3f km/l\n",r);

	}

}
