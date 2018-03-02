package URI;

import java.util.Scanner;

public class Main_1021 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n=0,m=0;
		int x=0;
		float[] notes={100,50,20,10,5,2};
		double[] moedas={1.00,0.50,0.25,0.10,0.05,0.01};
		int[] rn=new int[6];
		int[] rm=new int[6];
		for(int i=0;i<notes.length;i++){
			rn[i]=0;
			rm[i]=0;
		}
		
		
		Scanner ii=new Scanner(System.in);
		n=ii.nextFloat();
		if(n>=0 && n<=1000000.00){
			x=(int) n;
			m=n-x;
			
			for(int j=0;j<notes.length;j++){
				rn[j]=(int) (x/notes[j]);
				x=(int) (x%notes[j]);
				rm[j]=(int) (m/moedas[j]);
				m=(float) (x%moedas[j]);
				
				
			}
			
			
		}
		System.out.println("NOTAS:");
		for(int k=0;k<notes.length;k++){
			System.out.println(rn[k]+" nota(s) de R$ "+notes[k]);
		}
		System.out.println("MOEDAS:");
		for(int k=0;k<notes.length;k++){
			System.out.println(rm[k]+" moeda(s) de R$ "+moedas[k]);
		}

	}

}
