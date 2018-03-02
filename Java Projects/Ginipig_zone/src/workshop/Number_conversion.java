package workshop;
import java.util.Scanner;
public class Number_conversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	System.out.println("ENTER A DESCIMAL NUMBER : ");
	int n=in.nextInt();
	int m=n;
	//int x=0;s
	int r=0,b=0;
	for(int i=0,x=10;m!=0;i++,x=x*10){
		r=m%2;
		m=m/10;
		b=b+r*x;
		
	}
	System.out.println("BINNARY : "+b);
	}

}
