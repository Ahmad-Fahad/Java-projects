package URI;

import java.util.Scanner;

public class Main_1048 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n=0;
		int p=0;
		Scanner ii=new Scanner(System.in);
		n=ii.nextFloat();
		if(n>=0 && n<=400.00){
			p=15;
		}else if(n>=400.01 && n<=800.00){
			p=12;
		}else if(n>=800.01 && n<=1200.00){
			p=10;
		}else if(n>=1200.01 && n<=2000.00){
			p=7;
		}else if(n==2.000){
			p=4;
		}
		float i=p*n;
		float r=i/100;
		
		float t=r+n;
		
		System.out.printf("Novo salario: %.2f\n",t);
		System.out.printf("Reajuste ganho: %.2f\n",r);
		System.out.println("Em percenttual: "+p+" %");

	}

}
