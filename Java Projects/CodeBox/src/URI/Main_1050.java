package URI;

import java.util.Scanner;

public class Main_1050 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		String s="";
		Scanner ii=new Scanner(System.in);
		n=ii.nextInt();
		if(n==61){
			s="Brasilia";
		}else if(n==71){
			s="Salvador";
		}else if(n==11){
			s="Sao Paulo";
		}else if(n==21){
			s="Rio de Janeiro";
		}else if(n==32){
			s="Juiz de Foza";
		}else if(n==19){
			s="Campinass";
		}else if(n==27){
			s="Victoria";
		}else if(n==31){
			s="Belo Horizonte";
		}else{
			System.out.println("DDD nao cadastrado");
		}
		System.out.println(s);

	}

}
