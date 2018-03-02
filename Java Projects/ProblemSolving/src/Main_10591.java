import java.util.Scanner;

public class Main_10591 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		for(int i=0;N!=0;i++){
		int r=N%10;
		N=N/10;
		sum=sum+r*r;
		 N=sum;
		 
		//int x;
		//if(sum==1){
			System.out.println(sum);
		//}else
			

	}

}
}