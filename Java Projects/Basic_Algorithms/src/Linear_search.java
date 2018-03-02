import java.util.Scanner;
public class Linear_search {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ARR[]={12,2,34,56,7,89,8,123,83,51};
		System.out.println("Enter a number : ");
		Scanner input=new Scanner(System.in);
		int n=0,j=0;
		n=input.nextInt();
		int m=0;
		for(int i=0;i<10;i++){
			if(n==ARR[i]){
				m=1;
				j=i+1;
			}
		}
		 if(m==1){
		
			System.out.println(n+" is found in the location of "+j);
		 }
		 else
			 System.out.println(n+" is not found ");
	}

}
