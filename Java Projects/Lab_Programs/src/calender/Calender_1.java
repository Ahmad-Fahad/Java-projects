package calender;
import java.util.Scanner;

public class Calender_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int code=0;
		int r=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter A Month No : ");
		int n=input.nextInt();
		switch(n){
		case 1:
			code=5;
			break;
		case 2:
			code=1;
			break;
		case 3:
			code=2;
			break;
		case 4:
			code=4;
			break;
		case 5:
			code=6;
			break;
		case 6:
			code=2;
			break;
		case 7:
			code=4;
			break;
		case 8:
			code=7;
			break;
		case 9:
			code=3;
			break;
		case 10:
			code=5;
			break;
		case 11:
			code=1;
			break;
		case 12:
			code=3;
	
		}
		
		System.out.println("SAT\t SUN\t MON\t TUE\t WED\t THUS\t FRI");
		int k=1;
		int m=0;
		int x=0;
		int[][] DAY=new int[6][7];
		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				DAY[i][j]=0;
			}
		
			}
		for(int i=0;k<32;i++){
			for(int j=0;j<7;j++){
				DAY[i][j]=k;
		m=k+code;
		r=m%7;
		if(r==0){
			x=6;
		}
		else
		x=r-1;
		System.out.print(DAY[i][x]+"\t");
		k=k+1;
		

	}
			System.out.println();
	}
}
}