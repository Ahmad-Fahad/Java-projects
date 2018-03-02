
public class arr2d {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub.out
		int[][] a=new int[6][7];
		for(int i=0;i<5;i++){
			for(int j=0;j<7;j++){
				a[i][j]=0;	
			}
		}
		System.out.println("................MAY...............");
		System.out.println("SAT\tSUN\tMON\tTUE\tWED\tTHUS\tFRI");
		
		int k=1;
		int r=0,m=0,x=0;
		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				//a[i][j]=k;
				m=k+6;
				r=m%7;
				a[i][r]=k;
				System.out.print(a[i][r]+"\t");
				k++;
				if(k>31){
					break;
				}
			}
			System.out.println();
		}
		
		

	}

}
