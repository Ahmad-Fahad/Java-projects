package DATA_STRUCTURE;

public class QUICK_Sort {

	/**
	 * @param args
	 */
	public void sortNumbers(int[] list)
	{
		Quicksort(list,0,list.length-1);
	
	}
	public void Quicksort(int[] A, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end){
			int middle=Partition(A,start,end);
			Quicksort(A,start,middle-1);
			Quicksort(A,middle+1,end);
		}
	}
	public int Partition(int[] A, int start, int end) {
		// TODO Auto-generated method stub
		int pivot=A[end];
		int lo=start-1;
		for(int hi=start;hi<end;hi++){
			if(A[hi]<=pivot){
				lo++;
		int temp=A[lo];
		A[lo]=A[hi];
		A[hi]=temp;
			}
		}
		int temp=A[lo+1];
		A[lo+1]=A[end];
		A[end]=temp;
		
		return lo+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list={156,344,54,546,767,23,34,64,234,654,234,65,87,3,5,76,24,2,3,7,9,5,34,32,4525,345,0};
		QUICK_Sort qs=new QUICK_Sort();
		qs.sortNumbers(list);
		for(int i=0;i<list.length;i++){
			System.out.println(list[i]);
		}
	}

 }
