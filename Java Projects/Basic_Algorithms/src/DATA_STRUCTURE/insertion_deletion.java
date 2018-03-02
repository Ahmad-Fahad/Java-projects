package DATA_STRUCTURE;
import java.util.Scanner;
import java.util.Vector;

public class insertion_deletion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[] DATA={1,2,3,4,5,6,7,8};
		int[] INSERTED=new int[10];
		System.out.println("''''INSERTION..... ");
		for(int i=0;i<8;i++){
			INSERTED[i]=DATA[i];
		}
		Scanner input=new Scanner(System.in);
		System.out.println("Enter item : ");
		int n=input.nextInt();
		System.out.println("Enter Location :");
		int loc=input.nextInt();
		for(int i=DATA.length-1;i>=loc;i--){
			INSERTED[i+1]=DATA[i];
		}
		INSERTED[loc]=n;
		for(int j=0;j<9;j++){
			System.out.println(INSERTED[j]);
		}

		int[] DELETED=new int[10];
		for(int i=0;i<8;i++){
			DELETED[i]=DATA[i];
		}
		System.out.println("'''''SDELEYION........ ");
		
		System.out.println("value");
		int k=input.nextInt();
		System.out.println("location");
		int l=input.nextInt();
		for(int i=l;i<8;i++){
			DELETED[i]=DELETED[i+1];
		}
		
		for(int j=0;j<DATA.length-1;j++){
			System.out.println(DELETED[j]);
		}

	}

}


