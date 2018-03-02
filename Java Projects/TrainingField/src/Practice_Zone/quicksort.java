package Practice_Zone;

public class quicksort {
		
		
	static int[] a={44,33,11,55,77,90,40,60,99,22,88,66};
	
	static int n=12;
	int quick(int b,int e){
		int left,right,loc1,temp;
		left=b;
		right=e;
		loc1=b;
		while(true){
			while(a[loc1]<=a[right]&&loc1!=right){
				right=right-1;
				if(loc1==right){
					return loc1;
				
				}
				if(a[loc1]>a[right]){
					temp=a[loc1];
					a[loc1]=a[right];
					a[right]=temp;
					loc1=right;
					
				}
				while(a[left]<=a[loc1]&&left!=loc1){
					left=left+1;
					if(loc1==left){
						return left;
					}
					if(a[left]>a[loc1]){
						temp=a[loc1];
						a[loc1]=a[left];
						a[left]=temp;
						loc1=left;
					}
				}
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,top,beg,end,loc;
		int[] lower=new int[12];
		int[] upper=new int[12];
		quicksort on=new quicksort();
		System.out.println("INITIAL ARRAY : ");
		for( i=0;i<12;i++){
			System.out.println(a[i]);
			top=-1;
			if(n>1){
				top=top+1;
				lower[0]=0;
				upper[0]=n-1;
				
			}
			while (top!=-1) {
				beg=lower[top];
				end=upper[top];
				top=top-1;
				
				loc=on.quick(beg,end);
				if(beg<loc-1){
					top=top+1;
					lower[top]=beg;
					upper[top]=loc-1;
					
				}
				if(end>loc+1){
					top=top+1;
					lower[top]=loc+1;
					upper[top]=end;
				}
				
			}
		}

	}

}
