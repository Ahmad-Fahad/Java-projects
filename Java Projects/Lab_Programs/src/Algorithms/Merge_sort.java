package Algorithms;
import java.util.Scanner;

public class Merge_sort {
	static int[] A;
	static int[] B;
	static int[] C;
	
	void merging(int r1,int s1){
		int na,nb,nr,ptr,k;
		na=nb=ptr=0;
		while(na<r1 && nb<s1){
			if(A[na]<B[nb]){
				C[ptr]=A[na];
				ptr=ptr+1;
				na=na+1;
				
			}else{
				C[ptr]=B[nb];
				ptr=ptr+1;  
				nb=nb+1;
				
			}
		}
		if(na>r1){
			for(k=0;k<s1-nb;k++){
				C[ptr+k]=A[na+k];
				
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Merge_sort on=new Merge_sort();
		int i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of 1st array :  ");
		int r=0;
		r=in.nextInt();
		try{
		System.out.println("Enter the elements  of 1st array :  ");
		for(i=0;i<r;i++){
			A[i]=in.nextInt();
		}
		}
		catch(NullPointerException e){
			System.out.println("Exception : "+e);
		}
		System.out.println();
		System.out.println("Enter The size of Second array  : ");
		int s=0;
		s=in.nextInt();
		
		
		System.out.println("Enter the elements  of 2nd array :  ");
		try{
		for(i=0;i<s;i++){
			B[i]=in.nextInt();
		}
		
		}
		catch(NullPointerException e){
			System.out.println("Exception is "+e);
		}
		
		
		on.merging(r,s);
	
		
		System.out.println("Merged Array  C is : ");
		for(int y=0;y<r+s;y++){
			System.out.print(C[y]+"\t");
			
		}
		

	}

}
