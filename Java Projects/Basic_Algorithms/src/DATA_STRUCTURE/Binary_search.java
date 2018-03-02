package DATA_STRUCTURE;
import java.util.Scanner;

public class Binary_search {
	public static void main(String args[]){
		int[] DATA={11,22,33,44,55,66,77,88,99,100};;
	
		int beg=0;
		int end=9;
		int mid=(beg+end)/2;
		System.out.println("Enter a number : ");
		Scanner p=new Scanner(System.in);
		int n=p.nextInt();
		while(beg<=end && DATA[mid]!=n){
			
			if(n<DATA[mid]){
				end=mid-1;
			}
				else {
				beg=mid+1;	
			}
			mid=(beg+end)/2;
		}
			if(n==DATA[mid]){
				System.out.println("The number is found in : DATA["+mid+"]");
			}else
			{
				System.out.println("The number is not found in DATA");
			
		}
	}

}
