import java.util.Scanner;
public class calender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	    int l=in.nextInt();
	    int m=0;
	    m=l+6;
	    		int r=m%7;
	    int k=1;
		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				System.out.print(".\t");
				if(i==0 && j==r-1){
					break;
				}
				
				
			}
			for(int j=0;j<7;j++){
			if(i==0 && j==r){
				System.out.print("1\t");
			}
			k=k+1;
				System.out.print(k+"\t");
			
			
		}
			System.out.println();
		}

	}

}
