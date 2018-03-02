package URI;

import java.util.Scanner;

public class Main_1045 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A,B,C,t;
		Scanner ii=new Scanner(System.in);
		A=ii.nextDouble();
		B=ii.nextDouble();
		C=ii.nextDouble();
		if(A<B){
			t=B;
			B=A;
			A=t;
		}
		if(A<C){
			t=C;
			C=A;
			A=t;
		}
		 if(B<C){
			 t=C;
			 C=B;
			 B=t;
		 }
		 if(A>=(B+C)){
			 System.out.println("NAO FORMA TRIANGULO");
		 }  if(A*A==(B*B+C*C)){
			 System.out.println("TRIANGULO RETANGULO");
		 }  if(A*A>(B*B+C*C)){
			 System.out.println("TRIANGULO OBTUSANGULO");
		 }  if(A*A<(B*B+C*C)){
			 System.out.println("TRIANGULO ACUTANGULO");
		 }  if(A==B && B==C ){
			 System.out.println("TRIANGULO EQUILATERO");
		 }  if(A==B || A==C || B==C){
			 System.out.println("TRIANGULO ISOSCELES");
		 }
		

	}

}
