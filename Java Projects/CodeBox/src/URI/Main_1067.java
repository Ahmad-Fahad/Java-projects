package URI;

import java.util.Scanner;

public class Main_1067 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		Scanner ii=new Scanner(System.in);
		x=ii.nextInt();
		if(x>=1 && x<=1000){
			for(int i=0;i<=x;i++){
				if(i%2!=0){
					System.out.println(i);
				}
			}
		}

	}

}
