package URI;

import java.util.Scanner;

public class Main_1042 {

	/**
	 * @param args
	 */
	public static int[] a=new int[3];
	public static int[] b=new int[3];
	public void exchange(int[] a,int x,int y){
		int t=0;
		t=a[x];
		a[x]=a[y];
		a[y]=t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main_1042 ob=new Main_1042();
		
		Scanner ii=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			a[i]=ii.nextInt();
		}
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					ob.exchange(a,j,j+1);
					
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++){
			System.out.println(b[i]);
		}

	}

}
