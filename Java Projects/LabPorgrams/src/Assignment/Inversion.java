package Assignment;

import java.util.Scanner;

import BuildedIn.ShortPath;

public class Inversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] a=new int[5];
		for(int i=0;i<5;i++){
			a[i]=in.nextInt();
		}
		int c=0;
		for(int j=0;j<a.length-1;j++){
			for(int k=j+1;k<a.length;k++){
				if(a[j]>a[k]){
					c=c+1;
				}
			}
		}
		
			
			
			System.out.println(c);

	}

}
