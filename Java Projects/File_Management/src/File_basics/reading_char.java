package File_basics;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class reading_char {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		FileWriter fw=new FileWriter("src.txt");
		System.out.println("A file src.txt is opened for you : :" );
		System.out.println("Write Some thing Press Enter to save :" );
		
		FileOutputStream fos=new FileOutputStream("src.txt");
	char  c=(char)System.in.read();
		
		while(c != '\n'){
			fos.write(c);
			 
			c=(char)System.in.read();
		}
		fw.close();
}
		

	}


