package URI;

import java.util.Scanner;

public class Main_1044 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner ii=new Scanner(System.in);
		a=ii.nextInt();
		b=ii.nextInt();
		if(b%a==0 ){
			System.out.println("Sao multipos");
		}else
			System.out.println("Nao sao multiples");

	}

}
