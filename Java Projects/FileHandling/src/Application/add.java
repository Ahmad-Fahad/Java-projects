package Application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class add {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileInputStream ii=new FileInputStream("in.txt");
			FileOutputStream ot=new FileOutputStream("Untiled1.txt");
			
			int l=0,n=0,m=0,sum=0;
			int[] a=new int[3];
			 
			while((l=ii.read())!=-1){
				System.out.println(m+" array value ="+l );
				a[m]=l;
				m++;
			}
			for(int k=0;k<2;k++){
				sum=sum+a[k];
			}
			System.out.println("Result  = "+sum);
			ot.write(sum);
			
			ii.close();
			ot.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
