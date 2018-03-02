package Application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=null;
		int[] Data=new int[10];
		int m=0,n=0;
		
		try {
			s=new Scanner(new BufferedReader(new FileReader("note.txt")));
			while(s.hasNext()){
				Data[m]=s.nextInt();
				m++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//JOptionPane.showMessageDialog();
		}
		s.close();
		int temp=0;
		for(int i=0;i<Data.length-1;i++){
			for(int j=0;j<Data.length-1;j++){
				if(Data[j]>Data[j+1]){
					temp=Data[j];
					Data[j]=Data[j+1];
					Data[j+1]=temp;
				}
			}
		}
		try {
			FileWriter w=new FileWriter("rslt.txt");
			for(int i=0;i<Data.length;i++){
				 
					  w.write(Data[i]);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<Data.length;i++){
			System.out.println(Data[i]);
		}

	}

}
