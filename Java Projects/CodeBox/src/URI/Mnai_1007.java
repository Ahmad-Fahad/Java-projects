package URI;

import java.util.Scanner;

public class Mnai_1007 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=0,B=0,C=0,D=0;
		Scanner i=new Scanner(System.in);
		
		A=i.nextInt();
		B=i.nextInt();
		C=i.nextInt();
		D=i.nextInt();
		
		int m=(A*B)-(C*D);
		System.out.println("DIFERENCA = "+m);

	}

}
