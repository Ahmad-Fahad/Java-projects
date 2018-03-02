import java.util.Scanner;
public class Java {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,l=0;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		for(int w=0;w<n;w++){
			for(int x=n-w-1;x>0;x--){
				System.out.print(" ");
			}
		
			for(int j=w*2;j>=0;j++){
			l++;
			System.out.print(""+l+" ");
			}
			System.out.println();
		}
	
	}
		
}

