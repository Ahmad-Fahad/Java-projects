package URI;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.xml.ws.handler.MessageContext.Scope;

public class Main_1005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a=0,b=0,m=0,n=0;
		Scanner ii=new Scanner(System.in);
		a=ii.nextFloat();
		b=ii.nextFloat();
		n=(float) ((3.5*a)+(7.5*b));
		m=(float) (n/(3.5+7.5));
		 
	    
		System.out.printf("MEDEA = %.5f\n",m);
		

	}

}
