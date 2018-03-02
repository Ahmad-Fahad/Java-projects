package Recurtion;

public class fibonacci {

	/**
	 * @param args
	 */
	public int fibo(int n){
		if(n==0||n==1){
			return 1;
		}else{
			return fibo(n-1)+fibo(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci pp=new fibonacci();
		int p=pp.fibo(3);
		System.out.print(p+" ");

	}

}
