package Searching;

import java.util.Scanner;

public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Data={12,13,14,15,56,77,15,909};
		 
		Scanner ii=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=ii.nextInt();
		int m=0,p=0;
		for(int i=0;i<Data.length-1;i++){
			if(n==Data[i]){
				m=1;
				p=i;
			}
		}
		if(m==1){
			System.out.println("Found in Data["+p+"]");
		}
		
		

	}

}
