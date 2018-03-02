package URI;

import java.util.Scanner;

public class Main_1036 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a=0,b=0,c=0,d=0,R2 = 0,R1 = 0,p=0;
		Scanner ii=new Scanner(System.in);
		a=ii.nextFloat();
		b=ii.nextFloat();
		c=ii.nextFloat();
		p=(float) (Math.pow(b,2)-4*a*c);
		
		if(p<0 || 2*a==0){
			System.out.println("Impossivel calcular");
		}else{
			d=(float) Math.sqrt(p);
			R1=(-b+d)/(2*a);
			R2=(-b-d)/(2*a);
			System.out.printf("R1 = %.5f\nR2 = %.5f\n",R1,R2);
		}
		

	}

}
