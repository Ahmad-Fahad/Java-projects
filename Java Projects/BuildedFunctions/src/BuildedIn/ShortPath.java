package BuildedIn;

import java.util.Scanner;


public class ShortPath {

	/**
	 * @param args
	 */
	Scanner ii=new Scanner(System.in);
	 public int in(int n){
		 n=ii.nextInt();
		 return n;
	 }
	 public float in(float n){
		 n=ii.nextFloat();
		 return n;
	 }
	 public double in(Double n){
		 n=ii.nextDouble();
		 return n;
	 }
	 public char in(char n){
		 n=ii.next().charAt(0);
		 return n;
	 }
	 public String in(String n){
		 n=ii.nextLine();
		 return n;
	 }
	 
	 
	 
	 
	 
	public void ln()
	{
		System.out.println();
		}
	
	
	
	
	
	public static <T> void pn(T s){
		System.out.println(s);
	}
	
	public static <T> void pf(T s){
		System.out.printf("%s",s);
	}
		public static <T> void p(T s1){
			System.out.print(s1);
		
	}
		

}
