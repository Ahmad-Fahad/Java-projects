package practice;

import java.io.IOException;
import java.io.InputStreamReader;

public class Exstandard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InputStreamReader in=new InputStreamReader(System.in);
			char c;
			do{
				c=(char)in.read();
				System.out.print(c);
				
				
				
				
			}while(c!='h');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}