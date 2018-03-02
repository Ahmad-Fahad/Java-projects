
package URI;

import java.util.Scanner;

public class Main_1038 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X,Y;
		Scanner ii=new Scanner(System.in);
		X=ii.nextInt();
		Y=ii.nextInt();
		float r = 0;
		switch(X){
		case 1:
			r=(float) (Y*4.00);
			break;
		case 2:
			r=(float) (Y*4.50);
			break;
		case 3:
			r=(float) (Y*5.00);
			break;
		case 4:
			r=(float) (Y*2.00);
			break;
		case 5:
			r=(float) (Y*1.50);
			break;
		}
		System.out.printf("Total: R$ %.2f",r);
	

	}

}
