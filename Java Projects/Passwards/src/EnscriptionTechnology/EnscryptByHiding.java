package EnscriptionTechnology;

import java.util.Scanner;

public class EnscryptByHiding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s0="";
		String s1="";
		Scanner ii=new Scanner(System.in);
		s0=ii.nextLine();
		char[] ch;
		ch=s0.toCharArray();
		int m=ch.length*2;
		System.out.println(m);
		char[] ch1=new char[m];
		int k=97;
		int n=0;
		for(int i=1;i<=ch1.length;i++){
		 
			if(i%2==0){
				ch1[i-1]=(char)k;
			}else{
				ch1[i-1]=ch[n];
			}
			k=k+3;
			n=n+1;
			System.out.println(ch1[i-1]);
			System.out.println(ch[i]);
			System.out.println(k);
			System.out.println(n);
		}
		System.out.println();
		for(int i=0;i<m-1;i++){
			System.out.print(ch1[i]);
		}

	}

}
