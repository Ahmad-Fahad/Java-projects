package Exp;

import java.util.Scanner;

public class testaaseat {
	public static void main(String[] args) {
		String[] d=new String[40];
		int x=0;
		int[] g=new int[40];
		for(int j=0;j<40;j++){
			g[j]=0;
		}
		String a="";
		for(int i=0;i<10;i++){
			d[i]="";
		}
		
		Scanner in=new Scanner(System.in);
		for(int j=0;j<10;j++){
     	a=in.nextLine();
			
			  for(int i=0;i<10;i++)
			{
				if(g[i]==1){
					System.out.print("Sorry");
				
					break;
				}else{
					System.out.print("ok");
				d[x]=a;
				
				g[x]=1;
				x++;
				break;
				
			}
			}
			
		
		
	}
}
}
