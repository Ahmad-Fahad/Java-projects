package URI;

import java.util.Scanner;

public class Main_1037 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n=0;
		Scanner ii=new Scanner(System.in);
		n=ii.nextFloat();
		if(n<0 && n>100){
			System.out.println("Fora de intervalo");
		}else if(n>=0 && n<=25){
				System.out.println("Intervalo [0,25]");
			
		}else if(n>=25 && n<=50){
			System.out.println("Intervalo (25,50]");
			
		}else if(n>=50 && n<=75){
		System.out.println("Intervalo(50,75]");
		
		}else if(n>=75 && n<=100){
			System.out.println("Intervalo (75,100]");
	
		}
	}

}
