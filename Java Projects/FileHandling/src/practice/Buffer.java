package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Buffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader ii=new BufferedReader(new FileReader("note.txt"));
			PrintWriter oo=new PrintWriter(new FileWriter("result.txt"));
		
			String l;
			int[] a=new int[3];
			int m=0,p=0;
			while((l=ii.readLine())!=null){
				oo.println(l);
			}
			
		 
		ii.close();  
		oo.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
