package URI;

import java.util.Scanner;

public class Main_1018 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int N=0;
	    int[] reslt=new int[7];
	    float[] note={100,50,20,10,5,2,1};
	    for(int i=0;i<reslt.length;i++){
	    	reslt[i]=0;
	    	
	    }
	    Scanner ii=new Scanner(System.in);
	    N=ii.nextInt();
	    if(N>0 && N<1000000){
	    	int p=N;
	    	for(int j=0;j<note.length;j++){
	    		reslt[j]=(int) (p/note[j]);
	    		p=(int) (p%note[j]);
	    		
	    	}
	    	
	    	
	    }
	    System.out.println(N);
	    	for(int i=0;i<note.length;i++){
		System.out.printf("%d nota(s) de R$ %.2f\n",reslt[i],note[i]);
	    	}
	}

}
