package File_basics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class file_1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fr=new FileWriter("src.txt");
		PrintWriter pr=new PrintWriter(fr);
		
		
		File f=new File("output.txt");
		if(f.exists()==true){
			System.out.println("The File : "+f.getName());
			System.out.println("Absolute  Path of the file : "+f.getAbsolutePath());
			System.out.println("Path of the file : "+f.getPath());
		}else{
			System.out.println("The file does not exist");
		}

	}

}
