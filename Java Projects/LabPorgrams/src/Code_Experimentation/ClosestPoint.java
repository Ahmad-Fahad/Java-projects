package Code_Experimentation;

import java.util.Scanner;

import javax.swing.JOptionPane;

import BuildedIn.ShortPath;

public class ClosestPoint extends ShortPath{
	public static int[] x=new int[5];
	public static int[] y=new int[5];
	public static double[] po=new double[5];
	static double p=0;
	static int px=0;
	static int py=0;
	static int k=0;
	/**
	 * @param args
	 * @param p1 
	 * @param p2 
	 */
	public static void main(String[] args, int p1, int p2) {
		// TODO Auto-generated method stub
		
		ClosestPoint cp=new ClosestPoint();
		ShortPath sp=new ClosestPoint();
		Scanner ii=new Scanner(System.in);
		sp.pn("Enter 3 points : ");
		try{
		for(int  i=0;i<3;i++){
			x[i]=ii.nextInt();
			String s=ii.nextLine();
			y[i]=ii.nextInt();
		}
		}catch(Exception x){
			JOptionPane.showMessageDialog(null, "Exp in input");
		}
		try{
			for(int j=0;j<3;j++){
				for(int h=j+1;h<3;h++){
				 px=x[j]-x[h];
				 p1=px*px;
				py=y[j]-y[h];
				p2=py*py;
				p=Math.sqrt(p1+p2);
				po[k]=p;
				k++;
			}
			}
		}catch(Exception w){
			JOptionPane.showMessageDialog(null,"Exp in calc");
		}
				
		try {
			for(int l=0;l<2;l++){
				sp.pn(po[l]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,"Exp in printing");
		}
		
	}

}
