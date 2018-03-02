package URI;

import java.util.Scanner;

public class Main_1047 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sh=0,sm=0,eh=0,em=0,n,r,m = 0;
		Scanner ii=new Scanner(System.in);
		sh=ii.nextInt(); 
		sm=ii.nextInt();
		eh=ii.nextInt(); 
		em=ii.nextInt();
		if(sm<em){
			m=em-sm;
			
		}else if(sm>em){
			m=sm-em;
			m=60-m;
			sh=sh+1;
		}
		else if (sm==em){
			m=0;
		}
		n=24-sh;
		r=n+eh;
		if(r>=24){
			r=r-24;
		}
		System.out.println("O JOGO DUROU "+r+" HORA(S) E "+m+" MINUTO(S)");

	}

}
