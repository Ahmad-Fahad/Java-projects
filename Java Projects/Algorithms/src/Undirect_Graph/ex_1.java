package Undirect_Graph;

import java.util.Scanner;

public class ex_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,c=0;
		Scanner ii=new Scanner(System.in);
		System.out.println("Nodes : ");
		n=ii.nextInt();
		System.out.println("Edges : ");
		c=ii.nextInt();
		int[][] a=new int[100][100];
		
		 for(int i=0;i<c;i++){
			 for(int j=0;j<c;j++){
				 a[i][j]=0;
			 }
		 }
		 int u=0,v=0;
		 System.out.println("Enter Edges : ");
		 for(int i=0;i<c;i++){
			 u=ii.nextInt();
			 v=ii.nextInt();
			 a[u][v]=1;
			// a[v][u]=1;
		 }
		 for(int i=1;i<=n;i++){
			 for(int j=1;j<=n;j++){
				 if(a[i][j]==1  ){
					 System.out.println(i+"________"+j);
				 }
			 }
		 }
		

	}

}
