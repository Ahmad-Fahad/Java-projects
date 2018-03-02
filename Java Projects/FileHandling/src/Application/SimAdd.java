package Application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SimAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=null;
		int[] a=new int[2];
		int n=0,m=0;
		try {
			s=new Scanner(new BufferedReader(new FileReader("note.txt")));
			while(s.hasNext()){
				a[m]=s.nextInt();
				m++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.close();
		for(int i=0;i<2;i++){
			n=n+a[i];
		}
		System.out.println(n);
	}

}
