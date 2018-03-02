package URI;

import java.util.Scanner;

public class Main_1040 {

	/**
	 * @param args
	 */
	public void check(float n){
		
		
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main_1040 ob=new Main_1040();
		float a,b,c,d;
		Scanner ii=new Scanner(System.in);
		a=ii.nextFloat();
		b=ii.nextFloat();
		c=ii.nextFloat();
		d=ii.nextFloat();
		
		float n,m,s,p,l,k;
		m=(a*2)+(b*3)+(c*4)+(d*1);
		s=2+3+4+1;
		n=m/s;
		System.out.printf("Media: %.1f\n",n);
		
		if(n>=7){
			System.out.println("Aluno aprovado");
		}
		else if(n<=4.9){
			System.out.println("Aluno reprovado");
		}else if(n>=5 && n<=6.9){
			System.out.println("Aluno emexame");
			System.out.println("Nota do exame: ");
			p=ii.nextFloat();
			l=(n+p)/2;
			if(l>=5){
				System.out.println("Aluno aprovado");
			}else if(l<=4.9){
				System.out.println("Aluno reprovado");
			}
			System.out.printf("Media final: %.1f",l);
		}
		
	     
		

	}

}
