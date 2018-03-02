package Experiment;

import java.util.Scanner;
import BuildedIn.ShortPath;

public class Multiplication extends ShortPath{
				
	public static int n=0,m=0,p=0,a=0,b=0,c=0,d=0;
	/**
	 * @param args
	 */
	
	public int cal1(int n,int a,int c){
		
		int reslt=0;
		int h=a*c,k=1;
		for(int i=0;i<n;i++){
			k=k*10;
		}
		reslt=k*h;
		
		return reslt;
		
		
		
	}
		public int cal2(int n,int a,int b,int c,int d){
		
			int reslt=0;
			int j=a*d;
			int f=b*c;
			int y=j+f;
			int g=1;
			for(int i=0;i<n/2;i++){
				g=g*10;
			}
			reslt=y*g;
			return reslt;
		
		
		
	}
			public int cal3(int b,int d){
	
				int reslt=0;
				reslt=b*d;
	
				return reslt;
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		ShortPath l=new ShortPath();
		l.pn("Enter The Number Of Digits : ");
		n=in.nextInt();
		l.pn("Enter Two numbers : ");
		m=in.nextInt();
		p=in.nextInt();
		
		int q=1;
		for(int i=0;i<n/2;i++){
			q=q*10;
		}
		
		a=m/q;
		c=p/q;
		b=m%q;
		d=p%q;
		
		int u=0,v=0,w=0,result=0;
		Multiplication key=new Multiplication();
		u=key.cal1(n, a, c);
		v=key.cal2(n,a,b,c,d);
		w=key.cal3( b, d);
		result=u+v+w;
		
		l.pn(u);
        l.pn(v);
		l.pn(w);
		l.pn("The multiplication is   :  "+result);

	}

}
