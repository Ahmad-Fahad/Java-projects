import java.util.Scanner;
import java.io.*;
public class Main_11541 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		DataInputStream in=new DataInputStream(System.in);
		char ch = 0;
		int n;
		//ch=input.
		for(int j=0;j<5;j++){
		try {
			ch=(char)System.in.read();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		n=input.nextInt();
		for(int i=0;i<n;i++){
			System.out.print(ch);
		}
		try {
			char d=(char)System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
}