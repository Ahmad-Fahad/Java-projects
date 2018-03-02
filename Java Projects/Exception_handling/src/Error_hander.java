import java.util.InputMismatchException;
import java.util.Scanner;
public class Error_hander {
	public static int quotient(int m,int n)throws ArithmeticException{
		return m/n;
	}
	public static void main(String args[]){
		boolean v=true;
		do{
		try{
		Scanner in=new Scanner(System.in);
		int x,y,z;
		x=in.nextInt();
		y=in.nextInt();
		z=quotient(x,y);
		System.out.println(z);
		v=false;
		}
		catch(ArithmeticException a){
			System.out.println("Arithmetic Exception.");
			System.err.println("Exception :"+a);
		}catch(InputMismatchException c){
			System.out.println("Exception : "+c);
			System.out.println("please enter integer numbers ");
		}
				
	}

while(v);
	}
}