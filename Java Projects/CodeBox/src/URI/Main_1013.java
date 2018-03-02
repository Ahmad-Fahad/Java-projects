package URI;

import java.util.Scanner;

public class Main_1013 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0,AB=0,ABC=0;
		Main_1013 ob=new Main_1013();
		Scanner ii=new Scanner(System.in);
		a=ii.nextInt();
		b=ii.nextInt();
		c=ii.nextInt();
		
		AB=(a+b+ob.abs(a-b))/2;
		ABC=(AB+c+ob.abs(AB-c))/2;
		
		System.out.printf("%d eh o maior",ABC);
		
		 

	}

	private int abs(int i) {
		// TODO Auto-generated method stub
		if(i>=0){
			return i;
		}else
		return -i;
	}

}
