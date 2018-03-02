package Algorithms;

import java.util.Scanner;

public class Selection_sort {
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selection_sort  on=new Selection_sort ();
		Scanner in=new Scanner(System.in);
		int[] a=new int[10];
		int i,n;
		
		n=10;
		
		System.out.println("Enter 109 element to sort : ");
		for(int i1=0;i1<10;i1++){
			a[i1]=in.nextInt();
		}
		on.Selection_sort (a,n);
		
		
		System.out.println("The sorted Elements are : ");
		for(i=0;i<n;i++){
			System.out.println(a[i]+" ");
		}
		
	}

	private void Selection_sort(int[] a, int n) {
		// TODO Auto-generated method stub
		Selection_sort  ob=new Selection_sort ();
		int i=0,loc=0,temp=0;
		for(int i1=0;i1<n;i1++){
			
			loc=ob.Min(a,i,n);
			temp=a[loc];
			a[loc]=a[i1];
			a[i1]=temp;
			
			
		}
		
	}

	private int Min(int[] a, int lb, int ub) {
		// TODO Auto-generated method stub
		
		int min=lb;
		while(lb<ub){
			if(a[lb]<a[min]){
				min=lb;
				lb++;
				
			}
			return min;
		}
		
		return 0;
	}

	

}
