package Code_Experimentation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import BuildedIn.ShortPath;

public class Inversion {
	static int c=0;
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 
			Scanner in=new Scanner(System.in);
			int []a = new int[500];
			for(int i=0;i<5;i++){
				a[i]=in.nextInt();
			}
			for(int j=0;j<a.length-1;j++){
				for(int k=j+1;k<a.length;k++){
					if(a[j]>a[k]){
						c=c+1;
					}
				}
			}
			
				
				ShortPath p=new ShortPath();
				p.pn(c);
				
				 
		} 
			
			

	}


