import java.util.Scanner;
public class insertion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] DATA={1,2,3,4,5,6,7,8};
		int[] INSERTED=new int[10];
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

	}

}
