package Experiment;

import java.util.Scanner;

public class Three_Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[20];
		Scanner ii=new Scanner(System.in);
		for(int i=0;i<arr.length-1;i++){
			arr[i]=ii.nextInt();
			
		}
		int c=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length-1;j++){
				for(int k=j+1;k<arr.length-1;k++){
					if(arr[i]+arr[j]+arr[k]==0){
						c++;
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+ " =  0");
					}
				}
			}
		}

	}

}
