package URI;

import java.util.Scanner;

public class Main_1043 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			float a,b,c,p,A;
			Scanner ii=new Scanner(System.in);
			a=ii.nextFloat();
			b=ii.nextFloat();
			c=ii.nextFloat();
			if((a+b)>c && (b+c)>a && (c+a)>b){
				p=a+b+c;
				System.out.printf("Perimetro = %.1f",p);
			}else{
				A=((a+b)*c)/2;
				System.out.printf("Area = %.1f",A);
			}
			
	}

}
