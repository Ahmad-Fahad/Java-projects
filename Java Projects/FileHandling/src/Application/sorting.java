package Application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class sorting {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileInputStream in=new FileInputStream("in.txt");
			FileOutputStream out=new FileOutputStream("output.txt");
			
			int[] a =new int[1000];
		  int i=0,m=0;
		  while((m=in.read())!=-1){
			  a[i]=m;
			  i++;
		  }
			for(int o=0;o<a.length;o++){
				System.out.println(a[0]);
			}
			
			in.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
