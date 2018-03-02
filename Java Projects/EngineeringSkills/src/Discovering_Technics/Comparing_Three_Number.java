package Discovering_Technics;

import java.util.Scanner;

public class Comparing_Three_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three number : ");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		
		int m=a;
		
		if(b>a){
			m=b;
			
		}
		if(c>m){
			m=c;
		}
		System.out.println("Max number is : "+m);
	}

}
