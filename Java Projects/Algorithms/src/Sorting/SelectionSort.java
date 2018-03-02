package Sorting;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static int[] a={12,1,234,5,3};
	
	public int mini(int[] x,int y){
		int min=x[0],m=0;
		for(int i=y;i<a.length;i++){
		if(min>x[i]){
			min=x[i];
			m=i;
			
		}
		}
		return m;
	}
	public void exch(int[] a,int i,int m){
		
		int swap=0;
		swap=a[i];
		a[i]=a[m];
		a[m]=swap;
		
	 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort ob=new SelectionSort();
		int i=0;
		int min=0;
		for(int j=i+1;j<a.length;j++){
			min=ob.mini(a, j);
			if(a[i]>a[min]){
				ob.exch(a, i, min);
			}
			i++;
		}
		for(int i1=0;i1<a.length;i1++){
			System.out.println(a[i1]);
			
		}
		
		
		

	}

}
