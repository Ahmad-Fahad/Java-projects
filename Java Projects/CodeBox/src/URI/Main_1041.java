package URI;

import java.util.Scanner;

public class Main_1041 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x=0,y=0;
		Scanner ii=new Scanner(System.in);
		x=ii.nextFloat();
		y=ii.nextFloat();
		if(x==0 && y==0){
			System.out.println("Origem");
		}else if(x>0){
			if(y>0){
				System.out.println("Q1");
			}else if(y<0){
				System.out.println("Q4");
			}
			 
		}else if(x<0){
			if(y>0){
				System.out.println("Q2");
			}else if(y<0){
				System.out.println("Q3");
			}
			 
		}else if(x==0 && y>0 || y<0){
			System.out.println("Eixo Y");
		}else if(x>0 || x<0 && y==0){
			System.out.println("Eixo x");
		}

	}

		}
		
	