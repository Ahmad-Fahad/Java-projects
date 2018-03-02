package practice;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


import java.io.*;
public class ReadWrite {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f1=new File("sorce.txt");
		File f2=new File("store.txt");
		
		try{
			InputStream	in=new FileInputStream(f1);
			OutputStream out= new FileOutputStream(f2);
			
			byte[] buf=new byte[1024];
			int len;
			while((len=in.read(buf))>0){
				out.write(buf,0,len);
	
			}
			in.close();
			out.close();
			
			System.out.println("File Copied ");
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException  e){
			e.printStackTrace();
		}
		
	}

}
