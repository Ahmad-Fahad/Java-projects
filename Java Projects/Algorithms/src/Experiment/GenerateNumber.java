package Experiment;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class GenerateNumber {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n=0;
		 Random t=new Random();
		 try {
			 String l="";
			 int p=0;
			FileOutputStream w=new FileOutputStream("Number.txt");
			 for(int i=0;i<100;i++){
				 p=t.nextInt(100);
				 w.write(p);
				 System.out.println(t.nextInt(100));
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
