package DATA_STRUCTURE;

import java.util.Scanner;

public class Insertion_sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertion_sort on=new Insertion_sort();
		
		System.out.println("ENTER 5 ELEMENTS : ");
		Scanner in=new Scanner(System.in);
		int[] A=new int[10];
		for(int i=0;i<5;i++){
			A[i]=in.nextInt();
			
		}
		System.out.println("SORTED ELEMENTS : ");
		
		on.Insertion(A,5);
		for(int y=0;y<5;y++){
			System.out.println(A[y]);
		}
	}

	private void Insertion(int[] A, int n) {
		// TODO Auto-generated method stub
		int i=1,t=0;
		t=A[i];
		for(int j=i-1;j>=0;j--){
			if(A[j]>t){
				A[j+1]=A[j];
				break;
			}else{
				A[j+1]=t;
			}
		}
	}
}
