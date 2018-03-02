package Experiment;

import BuildedIn.ShortPath;

public class FuncOver {

	/**
	 * @param args
	 */
	int sizeof(int n){
		return 4;
		
	}
	
	int sizeof(float n){
		return 2;
		
	}
	int sizeof(double n){
		return 8;
		
	}
	int sizeof(char n){
		return 1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncOver ob=new FuncOver();
		int p=ob.sizeof('t');
		System.out.print(p);
		ShortPath pp=new ShortPath();
		String b="",m;
		 m=pp.in(b);
		pp.pn(m);
	}

}
