package string;

import java.util.Scanner;

public class Main_1024 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=0;
 		
		char[] ch;
		char[] ch1 = null;
		char[] ch2;
		int x,m;
		int[] a ;
		int y;
		int[] a1 = null;
		Scanner ii=new Scanner(System.in);
		N=ii.nextInt();
		String z=ii.nextLine();
		String[] ss=new String[N];
		if(N>=1 && N<=10000){
			for(int i=0;i<N;i++){
				ss[i]=ii.nextLine();
			}
 		for(int i1=0;i1<N;i1++){
			ch=ss[i1].toCharArray();
			a=new int[ch.length];
			if(ch.length >=1 && ch.length<=1000){
				for(int i=0;i<ch.length;i++){
					m=ch[i];
					if(m>='A' && m<='Z' || m>='a' && m<='z'){
						x=ch[i]+3;
					}else{
						x=m;

					}
					y=x%128;
					if(y<32){
						y=y+31;
					}
					a[i]=y;
				}
				a1=new int[ch.length];
				for(int i=ch.length-1,j=0;i>=0 && j<ch.length;i--,j++){
					a1[i]=a[j];
				}
				for(int i=ch.length/2;i<ch.length;i++){
					int n=a1[i]-1;
					if(n<0){
						n=n+127;
					}else if(n>=0){
						a1[i]=n;
					}
				}
				
			}
			
			for(int i=0;i<ch.length;i++){
				ch[i]=(char)a1[i];
			System.out.print(ch[i]);
			}
			System.out.println();
		}
			
		}
		

	}

}
