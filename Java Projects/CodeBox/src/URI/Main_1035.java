package URI;

import java.util.Scanner;

public class Main_1035 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=0,B=0,C=0,D=0;
		Scanner ii=new Scanner(System.in);
		A=ii.nextInt();
		B=ii.nextInt();
		C=ii.nextInt();
		D=ii.nextInt();
		if(C>0 && D>0){
			if(B>C && D>A){
				if(A%2==0){
					if((C+D)>(A+B)){
						System.out.println("Valores aceitos");
					}else
					{
						System.out.println("Valores nao aceitos");
					}
				}else
				{
					System.out.println("Valores nao aceitos");
				}
			}else
			{
				System.out.println("Valores nao aceitos");
			}
			
		}else
		{
			System.out.println("Valores nao aceitos");
		}
	}

}
