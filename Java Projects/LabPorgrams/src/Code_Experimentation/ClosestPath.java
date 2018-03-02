package Code_Experimentation;

import java.util.Scanner;

import javax.swing.JOptionPane;

import BuildedIn.ShortPath;

public class ClosestPath extends ShortPath{
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] point=new int[5][2];
		int[] d=new int[4];
		ShortPath s=new ShortPath();
		ClosestPath pp=new ClosestPath();
		Scanner ii=new Scanner(System.in);
		s.pn("Enter five points : ");
		
		for(int i=0;i<5;i++){
			for(int j=0;j<2;j++){
			 point[i][j]=ii.nextInt();
			// String b=ii.nextLine();
		}	
}
		try{
		
		int p = 0;
		for(int i=0;i<5;i++){
			for( int j=0;j<1;){
				int x1=point[i][j]-point[i+1][j];
				int x=x1*x1;
				int y1=point[i][j+1]-point[i+1][j+1];
				int y=y1*y1;
				p=(int) Math.sqrt(x+y);
				
			}
			s.pn(p);
			d[i]=p;
		}
		
		
		 
		}catch(Exception w){
			JOptionPane.showMessageDialog(null, w);
		}
		/*for(int l=0;l<4;l++){
			s.pn(d[l]);
		}*/
		
		
	}

}
