package URI;

import java.util.Scanner;

public class Main_1012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float A=0,B=0,C=0,R=0;
		Scanner ii=new Scanner(System.in);
		A=ii.nextFloat();
		B=ii.nextFloat();
		C=ii.nextFloat();
		R=(A*C)/2;
		System.out.printf("TRIANGULO: %.3f\n",R);
		R=(float) (3.14159*C*C);
		System.out.printf("CIRCULO: %.3f\n",R);
		R=C*(A+B)/2;
		System.out.printf("TRAPEZIO: %.3f\n",R);
		R=B*B;
		System.out.printf("QUADRADO: %.3f\n",R);
		R=A*B;
		System.out.printf("RECTANGULO: %.3f\n",R);

	}

}
