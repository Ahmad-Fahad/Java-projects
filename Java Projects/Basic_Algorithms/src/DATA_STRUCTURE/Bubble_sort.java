package DATA_STRUCTURE;
import java.util.Scanner;
public class Bubble_sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] DATA=new int[10]; 
	Scanner input=new Scanner(System.in);
	System.out.println("Enter 10 numbers :");
	for(int i=0;i<10;i++){
		DATA[i]=input.nextInt();
	}
	for(int i=0;i<10;i++){
		for(int j=0;j<9;j++){
			if(DATA[j]>DATA[j+1]){
				int t=DATA[j];
				DATA[j]=DATA[j+1];
				DATA[j+1]=t;
			}
		}
	}
	System.out.println("Sorted  numbers are :");
	for(int i=0;i<10;i++){
		System.out.println(DATA[i]);
	}

	}

}
