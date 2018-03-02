import java.util.Scanner;
public class Main_11150 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		int sum=N;
		if(N>=1&&N<=200){
			while(N!=0){
				try{
				int k=N; 
				int n=N/3;
				int r=k%3;
				N=n+r;
				sum=sum+n;
				//if(N==2){
					//N=2+1;
					System.out.println(sum);
				//}
				
				
				}
				catch(Exception E){
					System.out.println("Problemis : "+E);
				}
				
			}
		}
				
		

	}

}
