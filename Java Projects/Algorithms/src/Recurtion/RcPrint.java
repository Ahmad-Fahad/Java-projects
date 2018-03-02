package Recurtion;

import BuildedIn.ShortPath;

public class RcPrint {
	static ShortPath p=new ShortPath();
	static RcPrint pp=new RcPrint();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0,n=0;
		i=p.in(n);
		
		
		 
	  pp.pnt(i);
		 
		 
		 
	}

	private int pnt(int n) {
		 int y=0;
		// TODO Auto-generated method stub
		if(n==0){
			p.pn(0);
		}else{
			
			 y=pnt(n-1);
			 p.pn(y);
		}
		return n;
	}

}
