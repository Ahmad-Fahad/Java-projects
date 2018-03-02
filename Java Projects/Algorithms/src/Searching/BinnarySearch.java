package Searching;

import java.util.Scanner;

public class BinnarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Data={1,2,3,4,5,6,7};
		BinnarySearch k=new BinnarySearch();
		Scanner i=new  Scanner(System.in);
		int n=i.nextInt();
		int b,e,m,j=0;
		b=0;
		e=Data.length-1;
		m=(e+b)/2;
		while(b<=e && Data[m]!=n){
			if(n<Data[m]){
				e=m-1;
			}else {
				b=m+1;
			}
			m=(e+b)/2;
		}
		if(n==Data[m]){
			System.out.println("Found in :"+(m+1));
			
		}else{
			System.out.println("Not found in : ");
		}

	}
	

}
