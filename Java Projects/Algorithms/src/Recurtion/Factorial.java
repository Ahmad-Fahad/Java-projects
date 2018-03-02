package Recurtion;

import BuildedIn.ShortPath;

public class Factorial extends ShortPath{

	/**
	 * @param args
	 */
	public int fact(int n){
		if(n==1 || n==0){
			return 1;
			
		}else{
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f=new Factorial();
		ShortPath p=new ShortPath();
		int n=0;
		n=p.in(n);
		int m=f.fact(n);
		System.out.println(m);
	}

}
