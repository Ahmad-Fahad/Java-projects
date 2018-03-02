package DATA_STRUCTURE;

public class Concating_array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5};
		int[] b={6,7,8,9,10};
		int[] c=new int[10];
		for(int i=0;i<5;i++){
			c[i]=a[i];
		}
		for(int j=0;j<5;j++){
			c[j+5]=b[j];
		}
	for(int i=0;i<10;i++){
	System.out.println(c[i]);
	}
}
}