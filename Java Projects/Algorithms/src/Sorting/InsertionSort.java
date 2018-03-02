package Sorting;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static int[] a={2,34,612,1,6,8,232,231,3,3,3223,3,23,32,3,33,2,3,23,56};
	
	public void exchange(int[] a,int x,int y){
		int swap=0;
		
		swap=a[y];
		a[y]=a[x];
		a[x]=swap;
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort ob=new  InsertionSort();
		for(int i=0;i<a.length;i++){
			for(int j=i;j>0;j--){
				if(a[j]<a[j-1]){
					ob.exchange(a, j, j-1);
				}else{
					break;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}

}
