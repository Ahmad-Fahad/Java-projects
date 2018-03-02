package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class output {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InputStream in=null;
			OutputStream out=null;
			in=new FileInputStream("output.txt");
			out=new FileOutputStream("out.txt");
			int k=0;
			while((k=in.read())!=-1){
			out.write(k);
			}
			in.close();
			out.close();
		} catch(IOException c) {
			// TODO Auto-generated catch block
			
			}
		}
		

	}


