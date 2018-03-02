import java.util.Scanner;
public class Main_11805 {//cut _11805 before submit

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T,N,P,K;
		Scanner input=new Scanner(System.in);
		T=input.nextInt();
		if(T<=1000){
		for(int i=0;i<T;i++){
			N=input.nextInt();
			if(N>=2&&N<=23){
			K=input.nextInt();
			if(K>=1&&K<=N){
				P=input.nextInt();
				if(P>=1&&P<=200){
					int X=K+P;
					if(X==N){
						System.out.printf("Case %d: %d",i+1,X);
					}
					else{
						int R=X%N;
					System.out.printf("Case %d: %d",i+1,R);
					}
				}
			}
		}
		

	}
	}

}
}