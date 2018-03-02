import java.util.Scanner;
public class perfect_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=0;
		n=m;
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				 sum+=i;
			}
		}
		if(sum==m){
			System.out.println(m+" is a perfect number");
		}else
			System.out.println(m+" is not a perfect number");
	}

}
