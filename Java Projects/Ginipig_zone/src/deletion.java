import java.util.Scanner;
public class deletion {
	

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] DATA={1,2,3,4,5,6,7,8};
			int[] DELETED=new int[10];
			for(int i=0;i<8;i++){
				DELETED[i]=DATA[i];
			}
			Scanner input=new Scanner(System.in);
			System.out.println("value");
			int n=input.nextInt();
			System.out.println("location");
			int loc=input.nextInt();
			for(int i=loc;i<8;i++){
				DELETED[i]=DELETED[i+1];
			}
			
			for(int j=0;j<9;j++){
				System.out.println(DELETED[j]);
			}

		}

	}


