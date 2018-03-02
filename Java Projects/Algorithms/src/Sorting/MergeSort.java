package Sorting;

public class MergeSort {

	/**
	 * @param args
	 */
	public static int[] a={10,15,50,30,40,20,5,25,35,45};
	static MergeSort ob=new MergeSort();
	public void firstPart(int[] aux,int lo,int mid){
		
		for(int i=lo;i<mid;i++){
			for(int j=i;j>0;j--){
				if(aux[j]<aux[j-1]){
					ob.exchange(aux, j, j-1);
				}else{
					break;
				}
			}
		}
		
	}
	public void exchange(int[] aux,int x,int y){
		int swap=0;
		swap=aux[y];
		aux[y]=aux[x];
		aux[x]=swap;

	}
	public void lastPart(int[] aux,int m,int hi){
		int mid=m+1;
		for(int i=mid;i<hi+1;i++){
			for(int j=i;j>0;j--){
				if(aux[j]<aux[j-1]){
					ob.exchange(aux, j, j-1);
				}else{
					break;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aux=new int[a.length];
		for(int i=0;i<a.length;i++){
			aux[i]=a[i];
		}
		
		int lo = 0;
		int hi = a.length-1;
		int mid = (lo+hi)/2;
		ob.firstPart(aux, lo, mid);
		ob.lastPart(aux, mid, hi);
		for(int i=0;i<a.length;i++){
			System.out.print(" "+aux[i]);
		}
		 int i=lo,j=mid+1;
		for(int k=lo;k<=hi;k++){
			if(i>mid){
				a[k]=aux[j++];
			}else if(j>hi){
				a[k]=aux[i++];
			}else if(aux[i]>aux[j]){
				a[k]=aux[j++];
			}else{
				a[k]=aux[i++];
			}
		}
		System.out.println();
		for(int i1=0;i1<a.length;i1++){
			System.out.print(" "+a[i1]);
		}
	}

}
