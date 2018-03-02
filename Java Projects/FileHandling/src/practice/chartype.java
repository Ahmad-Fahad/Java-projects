package practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import BuildedIn.ShortPath;

public class chartype extends ShortPath{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String c;
			Scanner i1=new Scanner(System.in);
			ShortPath p=new ShortPath();
			FileReader r=new FileReader("note.txt");
			FileWriter w=new FileWriter("textFile.txt");
			int d=0;
			while((d=r.read())!=-1){
			w.write(d);
			}
			r.close();
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
