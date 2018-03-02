import java.io.DataInputStream;
import java.util.Scanner;

public class String_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] strarr={'a','b','c','d','e',' ','f','g'};
		String s="a boy";
		String st=new String();
		Scanner inp=new Scanner(System.in);
		st=inp.nextLine();
		System.out.println(st);
		String s1=new String();
		String s2=new String(s);
		String s3=new String(strarr);
		String s4=new String(strarr,2,2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	
		Scanner in=new Scanner(System.in);
		
		

	}

}
