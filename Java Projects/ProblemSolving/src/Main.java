import java.util.Scanner;//11875
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0,T=0;
		int j;
		Scanner in=new Scanner(System.in);
		T=in.nextInt();
		for(int i=0;i<T;i++){
			s=in.nextInt();
		int a[]=new int[s];
		for(j=0;j<s;j++){
			a[j]=in.nextInt();
		}
		
		System.out.println(a[j/2]);
		}
		

	}

}
